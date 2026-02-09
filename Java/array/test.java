package array;

import java.util.Scanner;

public class test {
    static int[] walls;
    static int[] blockMax;
    static int blockSize;
    static int wallsCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int wallCapacity = scanner.nextInt();
        String titanSequence = scanner.next();
        int p = scanner.nextInt(), m = scanner.nextInt(), g = scanner.nextInt();

        initializeStructures(n);

        for (int i = 0; i < n; i++) {
            int titanSize = getTitanSize(titanSequence.charAt(i), p, m, g);

            int foundWallIndex = findBestWall(titanSize);

            if (foundWallIndex != -1) {
                updateExistingWall(foundWallIndex, titanSize);
            } else {
                createNewWall(wallCapacity, titanSize);
            }
        }

        System.out.println(wallsCount);
    }

    private static void initializeStructures(int n) {
        walls = new int[n];
        blockSize = (int) Math.sqrt(n);
        blockMax = new int[(n / blockSize) + 1];
    }

    private static int findBestWall(int titanSize) {
        int totalBlocks = (wallsCount + blockSize - 1) / blockSize;

        for (int b = 0; b < totalBlocks; b++) {
            if (blockMax[b] < titanSize) continue;

            int start = b * blockSize;
            int end = Math.min(start + blockSize, wallsCount);
            for (int j = start; j < end; j++) {
                if (walls[j] >= titanSize) return j;
            }
        }
        return -1;
    }

    private static void updateExistingWall(int wallIndex, int titanSize) {
        walls[wallIndex] -= titanSize;
        refreshBlockMax(wallIndex / blockSize);
    }

    private static void createNewWall(int wallCapacity, int titanSize) {
        walls[wallsCount] = wallCapacity - titanSize;
        int blockIdx = wallsCount / blockSize;
        blockMax[blockIdx] = Math.max(blockMax[blockIdx], walls[wallsCount]);
        wallsCount++;
    }

    private static void refreshBlockMax(int blockIdx) {
        int start = blockIdx * blockSize;
        int end = start + blockSize;
        int currentMax = 0;
        for (int i = start; i < end && i < walls.length; i++) {
            if (walls[i] > currentMax) currentMax = walls[i];
        }
        blockMax[blockIdx] = currentMax;
    }

    private static int getTitanSize(char type, int p, int m, int g) {
        if (type == 'P') return p;
        if (type == 'M') return m;
        return g;
    }
}