package round;

/**
 * 圆孔
 *
 * @author zhanggeng
 * @date 2021/8/10 13:27
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg)
    {
        return this.radius>=peg.getRadius();
    }
}
