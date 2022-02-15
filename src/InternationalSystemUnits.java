public class InternationalSystemUnits {

    // attributes
    private double feet;
    private double mph;
    private double khm;
    private double m;

    // Default Constructor
    public InternationalSystemUnits(double feet, double mph, double khm, double m) {

        this.feet = feet;
        this.mph = mph;
        this.khm = khm;
        this.m = m;
    }

    /*
     *
     * Setters
     *
     */
    public void setFeet(double feet) {
        this.feet = feet;
    }

    public void setMph(double mph) {
        this.mph = mph;
    }

    public void setKhm(double khm) {
        this.khm = khm;
    }

    public void setM(double m) {
        this.m = m;
    }

    /*
     *
     * Getters
     *
     */
    public double getFeet() {
        return feet;
    }

    public double getMph() {
        return mph;
    }

    public double getKhm() {
        return khm;
    }

    public double getM() {
        return m;
    }

    /*
     *
     * Conversion of Imperial Units
     *
     */

    public double mphMeters(double mph) {
        double m = 0.0;
        return m = (mph*(1600/1)*(1/3600));
    }

    public double feetMeters(double feet) {
        double m = 0.0;
        return m = feet * .3048;
    }

    /*
     *
     * Conversion of Metric Units
     *
     */

    public double kmhMeters(double khm) {
        double m = 0.0;
        return m = (khm * (1000/1) * (1/3600));
    }
}
