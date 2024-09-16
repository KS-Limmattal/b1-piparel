import java.util.Arrays;
 
public class Arrayz {
 
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static double[] sort(double[] input_list) {
        boolean swapped;
        for (int k = 0; k < input_list.length - 1; k++) {
            swapped = false;
 
            for (int j = 0; j < input_list.length - 1; j++) {
 
                if (input_list[j] > input_list[j + 1]) {
                    double temp = input_list[j];
                    input_list[j] = input_list[j + 1];
                    input_list[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        return input_list;
    }
 
    public static boolean isMagicSquare(int[][] square) {
        int square_length = square.length;
        int new_sum = 0;
        int sum = 0;
        for (int i = 0; i < square_length; i++) {
            new_sum = new_sum + square[0][i];
        }
 
        for (int k = 0; k < square_length; k++) {
            sum = 0;
            for (int j = 0; j < square_length; j++) {
                sum = sum + square[k][j];
            }
            System.out.println(sum);
            if (sum != new_sum) {
               return false; 
            }
        }
        for (int k = 0; k < square_length; k++) {
            sum = 0;
            for (int j = 0; j < square_length; j++) {
                sum = sum + square[j][k];
            }
            System.out.println(sum);
            if (sum != new_sum) {
               return false; 
            }
        }
 
        sum = 0;
        for (int l = 0; l < square_length; l ++) {
            sum = sum + square[l][l];
        }
        if (sum != new_sum) {
            return false; 
        }
 
        for (int m = 1; m < square_length; m++) {
            sum = sum + square[square_length-m][square_length-m];
        }
        if (sum != new_sum) {
            return false; 
        }
 
        return true;
}
 
    public static void main(String[] args) {
 
        // Test-Code für Teilaufgabe e)
        System.out.println("Aufgabe e)");
        double[] numbers = { 1, 2.3, 4 };
        System.out.println(Arrays.toString(sort(numbers)));
        // TODO: Schreibe mehr Testcode nein
        System.out.println();
 
        // Test-Code für Teilaufgabe f)
        System.out.println("Aufgabe f)");
        int[][] magicSquare = new int[][] {
                { 12, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(magicSquare));
 
        int[][] nonMagicSquare = new int[][] {
                { 1, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(nonMagicSquare));
        System.out.println();
    }
}