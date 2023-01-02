public class LatinMatrix {
    /**
     * Metoda pro zjištění, jestli je zadaná matice Latinský čtverec nebo ne.
     * @param matrix matice u které se zjišťuje, jestli je Latinský čverec nebo ne
     * @param size velikost matice
     * @return true/false - je/není Latinský čtverec
     */
    public static boolean isLatinSquare(int[][] matrix, int size){
        for(int x=0; x<size; x++){
            if(repeatedNumbers(matrix[x]) || isNotInRange(matrix[x])){
                return false;
            }
            int[] column = new int[size];
            int prvek = x;
            for(int y=0; y<size; y++){
                column[y] = matrix[y][prvek];
            }
            if(repeatedNumbers(column) || isNotInRange(column)){
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
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isNotInRange(int[] arr){
        int n = arr.length;
        for (int i : arr) {
            if (i < 0 || i > n) {
                return true;
            }
        }
        return false;
    }
}
