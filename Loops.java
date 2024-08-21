public class Loops {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static String primeFactorisation(int n){
        String answer = "";
        for(int i = 2; i<=n;i++){
            if (n % i == 0){
                answer = answer + i + "*";
                n = n/i;
                i = 2;
            }

        }
        return "Prime factorisation of" + answer + "1";
    }
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        System.out.println(primeFactorisation(12));
        System.out.println(primeFactorisation(82));
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        //for (int n = 0; n < 12; n++){
            //System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        //System.out.println();
    }
//}
