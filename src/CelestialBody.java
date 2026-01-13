import java.util.Arrays;

public class CelestialBody {
     private String name = "UNKNOWN";
     private String orbitingBody = "SUN";
     private String[] moons = {"None"};
     private final double meanOrbitalDistanceAU;
     private final double rotationalPeriod;
     private final double massInEarthMasses;
     private final double radiusInEarthRadii;
     private final double massOfOrbitingBodyInSolarMasses;

    public CelestialBody(double orbitalDistance, double rotationPeriod, double mass, double radii){
        meanOrbitalDistanceAU = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInEarthMasses = mass;
        radiusInEarthRadii = radii;
        massOfOrbitingBodyInSolarMasses = 1;
    }

    public CelestialBody(double orbitalDistance, double rotationPeriod, double mass, double radii, String n){
        meanOrbitalDistanceAU = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInEarthMasses = mass;
        radiusInEarthRadii = radii;
        name = n;
        massOfOrbitingBodyInSolarMasses =1;
    }

    public CelestialBody(double orbitalDistance,double rotationPeriod, double mass, double radii, String[] moons){
        meanOrbitalDistanceAU = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInEarthMasses = mass;
        radiusInEarthRadii = radii;
        this.moons = moons;
        massOfOrbitingBodyInSolarMasses = 1;
    }

        public CelestialBody(double orbitalDistance, double rotationPeriod, double mass, double radii, String n, String[] moon){
        meanOrbitalDistanceAU = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInEarthMasses = mass;
        radiusInEarthRadii = radii;
        name = n;
        this.moons = moon;
        massOfOrbitingBodyInSolarMasses = 1;
    }

        public CelestialBody(String ob, double massOrbit, double orbitalDistance, double rotationPeriod, double mass, double radii){
        orbitingBody = ob;
        meanOrbitalDistanceAU = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInEarthMasses = mass;
        radiusInEarthRadii = radii;
        massOfOrbitingBodyInSolarMasses = massOrbit/333000;
    }

    public CelestialBody(String ob, double massOrbit, double orbitalDistance, double rotationPeriod, double mass, double radii, String n){
        orbitingBody = ob;
        meanOrbitalDistanceAU = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInEarthMasses = mass;
        radiusInEarthRadii = radii;
        name = n;
        massOfOrbitingBodyInSolarMasses = massOrbit/333000;
    }

    public double calculateGravity(){
        return massInEarthMasses / Math.pow(radiusInEarthRadii,2) * 9.81;
    }

    public double calculateOrbitalPeriod(){
        return Math.sqrt(Math.pow(meanOrbitalDistanceAU,3) / massOfOrbitingBodyInSolarMasses);
    }

    public double calculateMassKg(){
        return massInEarthMasses * 5.94 * Math.pow(10,24);
    }

    public double calculateRadius(){
        return radiusInEarthRadii * 6371;
    }

    @Override
    public String toString() {
        if (orbitingBody.equals("SUN"))
            return "Name: " + name + "\n" + "Orbits : " + orbitingBody + "\n" + "Mass (in earth masses): " + massInEarthMasses + "\n" + "Mass (in kg): " + calculateMassKg() + "kg\n" + "Radius (in earth radii): " + massInEarthMasses + " \n" + "Radius (in km): " + calculateRadius() + "\n" + "Gravitational Field Strength: " + calculateGravity() + "N/kg \n" + "Distance from Sun: " + meanOrbitalDistanceAU + " AU\n" + "Orbital Period: " + calculateOrbitalPeriod() + "years\n" + "Rotational Period: " + rotationalPeriod + "hrs\n" + "Moons/Satellites: " + Arrays.toString(moons);
        return "Name: " + name + "\n" + "Orbits : " + orbitingBody + "\n" + "Mass (in earth masses): " + massInEarthMasses + "\n" + "Mass (in kg): " + calculateMassKg() + "kg\n" + "Radius (in earth radii): " + massInEarthMasses + " \n" + "Radius (in km): " + calculateRadius() + "\n" + "Gravitational Field Strength: " + calculateGravity() + "N/kg \n" + "Distance from Planet: " + meanOrbitalDistanceAU + " AU\n" + "Orbital Period: " + calculateOrbitalPeriod() + "years\n" + "Rotational Period: " + rotationalPeriod + "hrs";

    }
}
