public class Arrayz {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static double[] sort(double[] input_list) {
        boolean swapped;
        for (int j = 0; j < input_list.length - 1; j++) {
            swapped = false;
 
            for (int i = 0; i < input_list.length - 1; i++) {
 
                if (input_list[i] > input_list[i + 1]) {
                    double temp = input_list[i];
                    input_list[i] = input_list[i + 1];
                    input_list[i + 1] = temp;
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
        boolean magicSquare = false; 
        int square_end = square.length;
        int line_sum = 0;
        int col_sum = 0;
        int dia_sum = 0;

        for (int i = 0; i < square_end; i++) {
            line_sum = line_sum + square[i][0];
            for (int k = 0; k < square_end - 1; k ++){
                col_sum = col_sum + square[0][k];
                dia_sum = dia_sum + square[i][k];
            }
        }
        System.out.println(line_sum);
        System.out.println(col_sum);
        System.out.println(dia_sum);

        if (line_sum + col_sum + dia_sum == 0) {
            return true;
        }
        else {
            return false;
        }
        
        }
           

    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe e)
        System.out.println("Aufgabe e)");
        double[] nr = {123, 356.131231, 1594};
        System.out.println(sort(nr));
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe f)
        System.out.println("Aufgabe f)");
        int[][] magicSquare = new int[][] { { 12, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(magicSquare));
        int[][] nonMagicSquare = new int[][] { { 1, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(nonMagicSquare));
        System.out.println();
    }
}
