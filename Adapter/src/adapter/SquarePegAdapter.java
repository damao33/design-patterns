package adapter;

import round.RoundPeg;
import square.SquarePeg;

/**
 * 方钉到圆孔的适配器
 *
 * @author zhanggeng
 * @date 2021/8/10 13:33
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}
