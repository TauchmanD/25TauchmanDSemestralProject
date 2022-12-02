public class Main {
    public static void main(String[] args) {
        String task = UI.chooseTask();
        switch (task) {
            case "lsm" -> {
                int size = UI.getMatrixSize();
                int[][] matrix = UI.createMatrix(size);
                System.out.println(LatinMatrix.isLatinSquare(matrix, size));
            }
            case "cht" -> System.out.println("Christmas Task");
        }
    }
}