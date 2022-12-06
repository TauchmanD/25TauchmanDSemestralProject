import java.util.HashSet;
public class LatinMatrix {
    /**
     * Metoda pro zjištění, jestli je zadaná matice Latinský čtverec nebo ne.
     * @param matrix matice u které se zjišťuje, jestli je Latinský čverec nebo ne
     * @param size velikost matice
     * @return true/false - je/není Latinský čtverec
     */
    public static boolean isLatinSquare(int[][] matrix, int size){
        for(int x=0; x<size; x++){
            if(repeatedNumbers(matrix[x]) || differentSumValue(matrix[x], size)){
                return false;
            }
            int[] column = new int[size];
            for(int y=0; y<size; y++){
                column[y] = matrix[y][x];
            }
            if(repeatedNumbers(column) || differentSumValue(column, size)){
                return false;
            }
        }
        return true;
    }

    /**
     * Zjištění, jestli se v sekvenci opakují nějaké čísla
     * @param arr sekvence čísel
     * @return true pokud se v sekvenci opakuje číslo
     */
    public static boolean repeatedNumbers(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        return arr.length != set.size();
    }

    /**
     * Zjištění nerovnosti sumy pole a hodnoty
     * @param array pole
     * @param size hodnota
     * @return true pokud se suma nerovná
     */
    public static boolean differentSumValue(int[] array, int size){
        return getNumberSumValue(size) != getArraySumValue(array);
    }

    /**
     * Výpočet sumy hodnoty
     * @param size hodnota
     * @return suma hodnoty
     */
    public static int getNumberSumValue(int size){
        if(size <= 0){
            return 0;
        }
        return size + getNumberSumValue(size-1);
    }

    /**
     * Výpočet sumy pole
     * @param arr pole
     * @return suma pole
     */
    public static int getArraySumValue(int[] arr){
        int arraySum = 0;
        for(int n : arr){
            arraySum+=n;
        }
        return arraySum;
    }
}
