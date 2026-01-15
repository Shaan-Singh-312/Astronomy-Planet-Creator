public class Moon {
    ///Stores the name of the moon
    private String name = "UNKNOWN";
    ///Stores The planet the moon is orbiting
    private final Planet orbitingBody;
    ///Stores the average distance between the planet and the moon
    private final double meanOrbitalDistanceKm;
    /// Stores the length of one day on the moon
    private final double rotationalPeriod;
    /// Stores the mass of the moon
    private final double massInKg;
    /// Stores the radius of the moon
    private final double radiusInKm;
    /// Stores the mass of the planet the moon is orbiting
    private final double massOfOrbitingBodyInKg;

    /**
     * Creates a moon object with no name
     * @param ob The body the moon orbits
     * @param orbitalDistance The mean distance from the planet in kilometers
     * @param rotationPeriod The length of one day on the moon measured in hours
     * @param mass The mass of the moon in kilograms
     * @param radii The radius of the moon in kilometers
     *
**/
    public Moon(Planet ob, double orbitalDistance, double rotationPeriod, double mass, double radii) {
        orbitingBody = ob;
        meanOrbitalDistanceKm = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInKg = mass;
        radiusInKm = radii;
        massOfOrbitingBodyInKg = ob.calculateMassKg();
    }

    /**
     * Creates a moon object with a name
     * @param ob The body the moon orbits
     * @param orbitalDistance The mean distance from the planet in kilometers
     * @param rotationPeriod The length of one day on the moon measured in hours
     * @param mass The mass of the moon in kilograms
     * @param radii The radius of the moon in kilometers
     * @param n The name of the moon
     **/

    public Moon(Planet ob, double orbitalDistance, double rotationPeriod, double mass, double radii, String n) {
        orbitingBody = ob;
        meanOrbitalDistanceKm = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInKg = mass;
        radiusInKm = radii;
        name = n;
        massOfOrbitingBodyInKg = ob.calculateMassKg();
    }

    /**
     * Used to calculate the gravitational field strength of the moon at its surface
     * @return a double representing the gravitational field strength in Newtons per kilogram
     */

    public double calculateGravity() {
        return massInKg / Math.pow(radiusInKm * 1000, 2) * 6.67 * Math.pow(10, -11);
    }

    /**
     * Calculates the time the moon takes to complete one revolution around its planet
     * @return a double representing the amount of years one rotation takes
     */

    public double calculateOrbitalPeriod() {
        return Math.sqrt((4 * Math.PI * Math.PI * Math.pow((meanOrbitalDistanceKm * 1000), 3)) / (massOfOrbitingBodyInKg * 6.67 * Math.pow(10, -11))) / (60 * 60 * 24 * 365);
    }

    /**
     * This returns a string with a collection of the relevant information about the Planet in the following order all on new lines: Name, What it orbits, Mass, Radius, Gravitational Field Strength, Distance from Star, Orbital period, and rotational period
     * This method overrides the default {@code Object.toString()} method.
     * @return A string representation of the planet
     */
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Orbits: " + orbitingBody.getName() + "\n" + "Mass (in kg): " + massInKg + "kg\n" + "Radius (in km): " + radiusInKm + "\n" + "Gravitational Field Strength: " + calculateGravity() + " N/kg \n" + "Distance from Star: " + meanOrbitalDistanceKm + " km\n" + "Orbital Period: " + calculateOrbitalPeriod() + "years\n" + "Rotational Period: " + rotationalPeriod + "hrs\n";
    }
}
