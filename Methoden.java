public class Methoden {

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.

    public static String hours(int seconds){
        int hours = seconds / 3600;
        seconds -= hours * 3600;
        int minutes = seconds / 60;
        seconds -= minutes * 60;
        return hours + ":" + minutes + ":" + seconds;
    }
    
    public static double distance(int x1, int y1, int x2, int y2){
        int n1 = x2 - x1;
        int n2 = y2 - y1;
        return Math.sqrt(n1 * n1 + n2 * n2);
    }


    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        System.out.println(hours(3));
        System.out.println(hours(75));
        System.out.println(hours(6593));
        System.out.println(hours(32130351));


        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println(distance(2,3,1,4));
        System.out.println(distance(1,4,7,9));
    }
    
}
