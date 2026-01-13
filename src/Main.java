public class Main{
    static void main() {
        String[] m = {"N1"};
        CelestialBody planet1 = new CelestialBody(7, 12,150,46,"Marigold",m);
        CelestialBody moon1 = new CelestialBody("Marigold", 150.0, .002, 24.0 ,.5,.5,"N1");
        System.out.println(planet1);
        System.out.println();

        System.out.println(moon1);

    }
}