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

    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe e)
        System.out.println("Aufgabe e)");
        System.out.println(sort(3));
        System.out.println(sorts(75));
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
