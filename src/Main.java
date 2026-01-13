public class Main{
    static void main() {
        String[] m = {"N1"};
        Planet planet1 = new Planet(7, 12,100,46,"Marigold",m);
        Moon moon1 = new Moon(planet1, 24000000, 24.0 ,2 * Math.pow(10,20),2600,"N1");
        System.out.println(planet1);
        System.out.println();

        System.out.println(moon1);

    }
}