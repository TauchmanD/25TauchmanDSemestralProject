public class Main {
    public static void main(String[] args) {
        //Testování
        System.out.println(LatinMatrix.repeatedNumbers(new int[]{1,2,3,4,5}));
        System.out.println(LatinMatrix.repeatedNumbers(new int[]{1,2,3,4,3}));
        System.out.println(LatinMatrix.isNotInRange(new int[] {1,2,3,8}));
        System.out.println(LatinMatrix.isNotInRange(new int[] {1,2,3,4}));
        System.out.println(LatinMatrix.isLatinSquare(new int[][]{{1,2},{2,1}}, 2));
        System.out.println(LatinMatrix.isLatinSquare(new int[][]{{1,2},{1,2}}, 2));
        String task = UI.chooseTask();
        switch (task) {
            case "lsm" -> {
                int size = UI.getMatrixSize();
                while(size>0){
                    int[][] matrix = UI.createMatrix(size);
                    System.out.println(LatinMatrix.isLatinSquare(matrix, size));
                    size = UI.getMatrixSize();
                }
            }
            case "cht" -> {
                ChristmasTask.printCT();
            }
        }
    }
}