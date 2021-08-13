package square;

/**
 * 方钉
 *
 * @author zhanggeng
 * @date 2021/8/10 13:30
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(width,2);
    }
}
