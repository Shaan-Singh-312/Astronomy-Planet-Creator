import java.util.Arrays;

public class Planet extends Astronomical_Object{
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
        meanOrbitalDistance = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        this.mass = mass;
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
        meanOrbitalDistance = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        this.mass = mass;
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
    public Planet(double orbitalDistance, double rotationPeriod, double mass, double radii, Astronomical_Object[] moons) {
        meanOrbitalDistance = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        this.mass = mass;
        radiusInEarthRadii = radii;
        orbitingbodies = moons;
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
    public Planet(double orbitalDistance, double rotationPeriod, double mass, double radii, String n, Astronomical_Object[] moon) {
        meanOrbitalDistance = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        this.mass = mass;
        radiusInEarthRadii = radii;
        name = n;
        orbitingbodies = moon;
    }

    /// @return the name of the Planet
    public String getName() {
        return name;
    }

    /**
     * Used to calculate the gravitational field strength of the planet at its surface
     * @return a double representing the gravitational field strength in Newtons per kilogram
     */
    public double calculateGravityNewtonsPerKilogram() {
        return mass / Math.pow(radiusInEarthRadii, 2) * 9.81;
    }


    /**
     * Calculates the time the planet takes to complete one revolution around its Star
     * @return a double representing the amount of years one rotation takes
     */
    public double calculateOrbitalPeriodYears() {
        return Math.sqrt(Math.pow(meanOrbitalDistance, 3));
    }

    /// @return a double representing the mass of the planet in kilograms
    public double calculateMassKg() {
        return mass * 5.94 * Math.pow(10, 24);
    }

    /// @return a double representing the radius of the planet in kilometers
    public double calculateRadiusKg() {
        return radiusInEarthRadii * 6371;
    }

    /**
     * This returns a string with a collection of the relevant information about a moon in the following order all on new lines: Name, What it orbits, Mass, Radius, Gravitational Field Strength, Distance from planet, Orbital period, and rotational period
     * This method overrides the default {@code Object.toString()} method.
     * @return A string representation of the moon
     */
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Orbits: SUN" + "\n" + "Mass (in earth masses): " + mass + "\n" + "Mass (in kg): " + calculateMassKg() + "kg\n" + "Radius (in earth radii): " + mass + " \n" + "Radius (in km): " + calculateRadiusKg() + "\n" + "Gravitational Field Strength: " + calculateGravityNewtonsPerKilogram() + " N/kg \n" + "Distance from Sun: " + meanOrbitalDistance + " AU\n" + "Orbital Period: " + calculateOrbitalPeriodYears() + "years\n" + "Rotational Period: " + rotationalPeriod + "hrs\n" + "Moons/Satellites: " + Arrays.toString(orbitingbodies);

    }
}
