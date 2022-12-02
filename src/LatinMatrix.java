import java.util.HashSet;
public class LatinMatrix {
    public static boolean isLatinSquare(int[][] matrix, int size){
        for(int x=0; x<size; x++){
            if(differentNumbers(matrix[x]) || differentSumValue(matrix[x], size)){
                return false;
            }
            int[] column = new int[size];
            for(int y=0; y<size; y++){
                column[y] = matrix[y][x];
            }
            if(differentNumbers(column) || differentSumValue(column, size)){
                return false;
            }
        }
        return true;
    }
    private static boolean differentNumbers(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        return arr.length != set.size();
    }
    private static boolean differentSumValue(int[] array, int size){
        return getNumberSumValue(size) != getArraySumValue(array);
    }
    private static int getNumberSumValue(int size){
        if(size <= 0){
            return 0;
        }
        return size + getNumberSumValue(size-1);
    }
    private static int getArraySumValue(int[] arr){
        int arraySum = 0;
        for(int n : arr){
            arraySum+=n;
        }
        return arraySum;
    }
}
