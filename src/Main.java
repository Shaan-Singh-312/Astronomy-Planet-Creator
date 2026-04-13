import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Astronomical_Object> m = new ArrayList<>();
        Planet planet1 = new Planet(7, 4, 150, 46, "Marigold", m);
        Moon moon1 = new Moon(planet1, 1200000, 24.0, 2 * Math.pow(10, 23), 2600, "Velvet");
        Moon moon2 = new Moon(planet1, 1000000, 999999, 2.5 * Math.pow(10,22), 2000, "Moon2");
        System.out.println(planet1);
        System.out.println();
        System.out.println(moon1);
        System.out.println();
        System.out.println(planet1);

    }
}