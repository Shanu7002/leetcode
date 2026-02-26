public class BoatMovements {
    public static boolean canTravelTo(boolean[][] gameMatrix, int fromRow, int fromCol, int toRow, int toCol) {
        if (toRow < 0 || toRow >= gameMatrix.length) return false;
        if (toCol < 0 || toCol >= gameMatrix[0].length) return false;

        if (gameMatrix[toRow][toCol]) {
            int deltaRow = Math.abs(fromRow - toRow);
            int deltaCol = Math.abs(fromCol - toCol);

            if (deltaRow > 0 && deltaCol > 0) return false;
            if (deltaRow == 0 && deltaCol > 2) return false;
            if (deltaCol == 0 && deltaRow > 1) return false;

            return true;
        }
            
        return false;
    }

    public static void main(String[] args) {
        boolean[][] matrix = {
            { true,  true,  true,  false },
            { false, false, true,  true  },
            { true,  true,  true,  true  },
            { false, true,  false, true  }
        };
        System.out.println(canTravelTo(matrix, 0, 0, 0, 2));
    }
}