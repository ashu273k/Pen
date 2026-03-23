public class FountainPen extends Pen {

    public FountainPen(String color, boolean cap) {
        super(color, cap);
    }

    @Override
    protected String getPenTypeLabel() {
        return "FOUNTAIN_PEN";
    }

    @Override
    protected double getInkReductionPerChar() {
        return 0.80;
    }

    @Override
    protected String refillBehavior(String oldColor, String newColor) {
        return "Fountain pen converter cleaned and refilled: " + oldColor + " -> " + newColor + ".";
    }
}