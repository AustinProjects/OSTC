package GasMilleage;

public class Automobile {
    private int mpg;
    private double tank = 0;

    public Automobile(int n) {
        mpg = n;
    }
    public void fillUp(double f) {
        tank+=f;
    }
    public void takeTrip(int t) {
        tank -= (double)t/mpg;
    }
    public double reportFuel() {
        return tank;
    }
}
