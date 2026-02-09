package array;

public class test {

    public static int calculateRequiredWalls(int qnt, int wallSize, String titans, int pSize, int mSize, int gSize) {
        // throw error verificatiob
        if (titans == null || titans.isEmpty()) throw new IllegalArgumentException("Titans cannot be empty.");
        if (qnt != titans.length()) throw new IllegalArgumentException("Quantity smaller than titans length.");
        if (wallSize <= 0) throw new IllegalArgumentException("Wall size must be positive.");

        long totalSize = 0;

        // look every letter inside the titans
        for (int i = 0; i < titans.length(); i++) {
            char titan = titans.charAt(i);
            switch (titan) {
                case 'P' -> totalSize += pSize;
                case 'M' -> totalSize += mSize;
                case 'G' -> totalSize += gSize;
                // Default case throw error too
                default  -> throw new IllegalArgumentException("Unknown titan type: " + titan);
            }
        }

        if (totalSize == 0) return 0;
        return (int) ((totalSize + wallSize - 1) / wallSize);
    }

    public static void main(String[] args) {
        System.out.println(calculateRequiredWalls(3,20, "MPG", 3, 8, 10));
        System.out.println(calculateRequiredWalls(8,20, "MGGPGGGP", 3, 8, 10));
        System.out.println(calculateRequiredWalls(4,6, "GPMP", 3, 4, 5));
    }
}