public class Main{
    public static void main(String[] args) {
        String[] m = {"N1"};
        Planet planet1 = new Planet(7, 12,150,46,m);
        Moon moon1 = new Moon(planet1, 1200000, 24.0 ,2 * Math.pow(10,23),2600);
        System.out.println(planet1);
        System.out.println();

        System.out.println(moon1);

    }
}