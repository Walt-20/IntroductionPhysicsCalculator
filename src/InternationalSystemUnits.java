public class InternationalSystemUnits {
    private double mph;
    private double m;

    public InternationalSystemUnits() {

    }

    //getters
    public getMeterPerSec(double mph) {
        return this.mph;
    }
    //setter
    public void setMetersPerSecond() {
        mphMeters(mph);
    }

    /*
     *
     * Conversion of Imperial Units
     *
     */

    public static void mphMeters(double mph) {
        double m = (mph*(1600/1)*(1/3600));
    }

    public static void feetMeters(double feet) {
        double m = feet * .3048;
    }

    /*
     *
     * Conversion of Metric Units
     *
     */

    public static void kmhMeters(double khm) {
        double m = (khm * (1000/1) * (1/3600));
    }
}
