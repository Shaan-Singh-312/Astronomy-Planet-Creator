import java.util.ArrayList;

public class Astronomical_Object {

    String name;
    double rotationalPeriod;
    double meanOrbitalDistance;
    double mass;

    public String getName() {
        return name;
    }

    public double getRotationalPeriod() {
        return rotationalPeriod;
    }

    public double getMeanOrbitalDistance() {
        return meanOrbitalDistance;
    }

    public double getMass() {
        return mass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setMeanOrbitalDistance(double meanOrbitalDistance) {
        this.meanOrbitalDistance = meanOrbitalDistance;
    }

    public void setRotationalPeriod(double rotationalPeriod) {
        this.rotationalPeriod = rotationalPeriod;
    }
}
