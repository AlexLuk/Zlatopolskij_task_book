package chapter1;

/** Class for calculating distance from point over planet surface to the line on horizon
 * 1.27.  Считая, что Земля —  идеальная сфера с радиусом  6350 км, определить расстояние до линии горизонта
 * от точки с заданной высотой над Землей.
 */
public class FieldOfViewCalculator {
    private int planetRadius;

    /** Create field of view calculator object
     * @param planetRadius - specified planet radius in kilometres
     */
    public FieldOfViewCalculator(int planetRadius) {
        this.planetRadius = planetRadius;
    }

    /** Calculate distance from point on exact height till horizon
     * @param height - specified height in kilometres
     * @return - distance till horizon in kilometres
     */
    public int getDistanceToHorizon(double height) {
        double distance = Math.sqrt(Math.pow(planetRadius + height,2) - Math.pow(planetRadius,2));
        return (int) distance;
    }
}
