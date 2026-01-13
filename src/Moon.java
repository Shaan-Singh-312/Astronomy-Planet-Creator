public class Moon {
    private String name = "UNKNOWN";
    private Planet orbitingBody;
    private final double meanOrbitalDistanceKm;
    private final double rotationalPeriod;
    private final double massInKg;
    private final double radiusInKm;
    private final double massOfOrbitingBodyInKg;

    public Moon(Planet ob, double orbitalDistance, double rotationPeriod, double mass, double radii){
        orbitingBody = ob;
        meanOrbitalDistanceKm = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInKg = mass;
        radiusInKm= radii;
        massOfOrbitingBodyInKg = ob.calculateMassKg();
    }

    public Moon(Planet ob, double orbitalDistance, double rotationPeriod, double mass, double radii, String n){
        orbitingBody = ob;
        meanOrbitalDistanceKm = orbitalDistance;
        rotationalPeriod = rotationPeriod;
        massInKg = mass;
        radiusInKm = radii;
        name = n;
        massOfOrbitingBodyInKg = ob.calculateMassKg();
    }
    public double calculateGravity(){
        return massInKg / Math.pow(radiusInKm/1000,2) * 6.67 * Math.pow(10,-11);
    }

    public double calculateOrbitalPeriod(){
        return Math.sqrt((4* Math.PI * Math.PI * Math.pow((meanOrbitalDistanceKm/1000),3)) / (massOfOrbitingBodyInKg * 6.67 * Math.pow(10,-11))) /(60*60*24*365);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Orbits: " + orbitingBody.getName() + "\n" + "Mass (in kg): " + massInKg + "kg\n" + "Radius (in km): " + radiusInKm + "\n" + "Gravitational Field Strength: " + calculateGravity() + " N/kg \n" + "Distance from Planet: " + meanOrbitalDistanceKm + " km\n" + "Orbital Period: " + calculateOrbitalPeriod() + "years\n" + "Rotational Period: " + rotationalPeriod + "hrs\n";
    }
}
