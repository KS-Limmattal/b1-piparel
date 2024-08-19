public class Methoden {

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.

    public static String hours(int seconds){
        int hours = seconds / 3600;
        seconds -= hours * 3600;
        int minutes = seconds / 60;
        seconds -= minutes * 60;
        return hours + ":" + minutes + ":" + seconds;
    }
    
    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        System.out.println(hours(3));
        System.out.println(hours(75));
        System.out.println(hours(6593));

        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println();
    }
    
}
