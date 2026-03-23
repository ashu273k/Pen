public class BallPen extends Pen {

    public BallPen(String color, boolean cap) {
        super(color, cap);
    }

    @Override
    protected String getPenTypeLabel() {
        return "BALL_PEN";
    }

    @Override
    protected double getInkReductionPerChar() {
        return 0.35;
    }

    @Override
    protected String refillBehavior(String oldColor, String newColor) {
        return "Ball pen refill changed from " + oldColor + " to " + newColor + ".";
    }
}
