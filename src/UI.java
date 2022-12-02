import java.util.Scanner;
public class UI {
    public static Scanner sc = new Scanner(System.in);
    public static String chooseTask(){
        while(true){
            System.out.println("Vyber si ulohu\n(1) LatinSquareMatrix (2) Christmas Task");
            int task = sc.nextInt();
            switch (task){
                case 1:
                    return "lsm";
                case 2:
                    return "cht";
            }
        }
    }
    public static int[][] createMatrix(int size){
        int[][] matrix = new int[size][size];
        System.out.println("Matrix");
        for(int x=0; x<size; x++) {
            for (int y = 0; y < size; y++) {
                matrix[x][y] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static int getMatrixSize(){
        System.out.println("Size");
        return sc.nextInt();
    }
}
