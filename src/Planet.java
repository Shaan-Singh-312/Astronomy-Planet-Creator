import java.util.Arrays;

public class Planet {
    ///Stores the name of the moon
    private String name = "UNKNOWN";
    ///Stores a list of the moons of the planet
    private String[] moons = {"None"};
    ///Stores the average distance between the planet and the Sun in AUs
    private final double meanOrbitalDistanceAU;
    /// Stores the length of one day on the planet
    private final double rotationalPeriod;
    /// Stores mass of the planet in earth masses
    private final double massInEarthMasses;
    /// Stores the radius of the planet in earth radii
    private final double radiusInEarthRadii;

    /**
     * Creates a planet object with no name and no moons
     * @param orbitalDistance The mean distance from the planet in kilometers
     * @param rotationPeriod The length of one day on the moon measured in hours
     * @param mass The mass of the moon in kilograms
     * @param radii The radius of the moon in kilometers
     *
     **/
    public Planet(double orbitalDistance, double rotationPeriod, double mass, double radii) {
        meanOrbitalDistanceAU = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInEarthMasses = mass;
        radiusInEarthRadii = radii;
    }

    /**
     * Creates a planet object with a name and no moons
     * @param orbitalDistance The mean distance from the planet in kilometers
     * @param rotationPeriod The length of one day on the moon measured in hours
     * @param mass The mass of the moon in kilograms
     * @param radii The radius of the moon in kilometers
     * @param n The name of the moon
     *
     **/
    public Planet(double orbitalDistance, double rotationPeriod, double mass, double radii, String n) {
        meanOrbitalDistanceAU = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInEarthMasses = mass;
        radiusInEarthRadii = radii;
        name = n;
    }

    /**
     * Creates a planet object with no name and with moons
     * @param orbitalDistance The mean distance from the planet in kilometers
     * @param rotationPeriod The length of one day on the moon measured in hours
     * @param mass The mass of the moon in kilograms
     * @param radii The radius of the moon in kilometers
     * @param moons A list of moons of the planet
     **/
    public Planet(double orbitalDistance, double rotationPeriod, double mass, double radii, String[] moons) {
        meanOrbitalDistanceAU = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInEarthMasses = mass;
        radiusInEarthRadii = radii;
        this.moons = moons;
    }

    /**
     * Creates a planet object with a name and with moons
     * @param orbitalDistance The mean distance from the planet in kilometers
     * @param rotationPeriod The length of one day on the moon measured in hours
     * @param mass The mass of the moon in kilograms
     * @param radii The radius of the moon in kilometers
     * @param moon A list of moons of the planet
     * @param n The name of the planet
     **/
    public Planet(double orbitalDistance, double rotationPeriod, double mass, double radii, String n, String[] moon) {
        meanOrbitalDistanceAU = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInEarthMasses = mass;
        radiusInEarthRadii = radii;
        name = n;
        this.moons = moon;
    }

    /// @return the name of the Planet
    public String getName() {
        return name;
    }

    /**
     * Used to calculate the gravitational field strength of the planet at its surface
     * @return a double representing the gravitational field strength in Newtons per kilogram
     */
    public double calculateGravity() {
        return massInEarthMasses / Math.pow(radiusInEarthRadii, 2) * 9.81;
    }


    /**
     * Calculates the time the planet takes to complete one revolution around its Star
     * @return a double representing the amount of years one rotation takes
     */
    public double calculateOrbitalPeriod() {
        return Math.sqrt(Math.pow(meanOrbitalDistanceAU, 3));
    }

    /// @return a double representing the mass of the planet in kilograms
    public double calculateMassKg() {
        return massInEarthMasses * 5.94 * Math.pow(10, 24);
    }

    /// @return a double representing the radius of the planet in kilometers
    public double calculateRadius() {
        return radiusInEarthRadii * 6371;
    }

    /**
     * This returns a string with a collection of the relevant information about a moon in the following order all on new lines: Name, What it orbits, Mass, Radius, Gravitational Field Strength, Distance from planet, Orbital period, and rotational period
     * This method overrides the default {@code Object.toString()} method.
     * @return A string representation of the moon
     */
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Orbits: SUN" + "\n" + "Mass (in earth masses): " + massInEarthMasses + "\n" + "Mass (in kg): " + calculateMassKg() + "kg\n" + "Radius (in earth radii): " + massInEarthMasses + " \n" + "Radius (in km): " + calculateRadius() + "\n" + "Gravitational Field Strength: " + calculateGravity() + " N/kg \n" + "Distance from Sun: " + meanOrbitalDistanceAU + " AU\n" + "Orbital Period: " + calculateOrbitalPeriod() + "years\n" + "Rotational Period: " + rotationalPeriod + "hrs\n" + "Moons/Satellites: " + Arrays.toString(moons);

    }
}
