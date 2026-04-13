public class Moon extends Astronomical_Object{
    ///Stores The planet the moon is orbiting
    private final Planet orbitingBody;
    /// Stores the radius of the moon
    private final double radiusInKm;
    /// Stores the mass of the planet the moon is orbiting
    private final double massOfOrbitingBodyInKg;

    /**
     * Creates a moon object with no name
     * @param ob The body the moon orbits
     * @param orbitalDistanceKm The mean distance from the planet in kilometers
     * @param rotationPeriod The length of one day on the moon measured in hours
     * @param mass The mass of the moon in kilograms
     * @param radii The radius of the moon in kilometers
     *
**/
    public Moon(Planet ob, double orbitalDistanceKm, double rotationPeriod, double mass, double radii) {
        orbitingBody = ob;
        orbitingBody.addOrbitingBody(this);
        meanOrbitalDistance = orbitalDistanceKm;
        rotationalPeriod = rotationPeriod;
        this.mass = mass;
        radiusInKm = radii;
        massOfOrbitingBodyInKg = ob.calculateMassKg();
        name = "UNKNOWN";
    }

    /**
     * Creates a moon object with a name
     * @param ob The body the moon orbits
     * @param orbitalDistanceKm The mean distance from the planet in kilometers
     * @param rotationPeriod The length of one day on the moon measured in hours
     * @param mass The mass of the moon in kilograms
     * @param radii The radius of the moon in kilometers
     * @param n The name of the moon
     **/

    public Moon(Planet ob, double orbitalDistanceKm, double rotationPeriod, double mass, double radii, String n) {
        orbitingBody = ob;
        orbitingBody.addOrbitingBody(this);
        meanOrbitalDistance = orbitalDistanceKm;
        rotationalPeriod = rotationPeriod;
        this.mass = mass;
        radiusInKm = radii;
        name = n;
        massOfOrbitingBodyInKg = ob.calculateMassKg();
    }

    /**
     * Used to calculate the gravitational field strength of the moon at its surface
     * @return a double representing the gravitational field strength in Newtons per kilogram
     */

    public double calculateGravityNewtonsPerMeter() {
        return mass / Math.pow(radiusInKm * 1000, 2) * 6.67 * Math.pow(10, -11);
    }

    /**
     * Calculates the time the moon takes to complete one revolution around its planet
     * @return a double representing the amount of years one rotation takes
     */

    public double calculateOrbitalPeriodYears() {
        return Math.sqrt((4 * Math.PI * Math.PI * Math.pow((meanOrbitalDistance * 1000), 3)) / (massOfOrbitingBodyInKg * 6.67 * Math.pow(10, -11))) / (60 * 60 * 24 * 365);
    }

    /**
     * This returns a string with a collection of the relevant information about the Planet in the following order all on new lines: Name, What it orbits, Mass, Radius, Gravitational Field Strength, Distance from Star, Orbital period, and rotational period
     * This method overrides the default {@code Object.toString()} method.
     * @return A string representation of the planet
     */
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Orbits: " + orbitingBody.getName() + "\n" + "Mass (in kg): " + mass + "kg\n" + "Radius (in km): " + radiusInKm + "\n" + "Gravitational Field Strength: " + calculateGravityNewtonsPerMeter() + " N/kg \n" + "Distance from Star: " + meanOrbitalDistance + " km\n" + "Orbital Period: " + calculateOrbitalPeriodYears() + "years\n" + "Rotational Period: " + rotationalPeriod + "hrs\n";
    }
}
