public class GelPen extends Pen {

    public GelPen(String color, boolean cap) {
        super(color, cap);
    }

    @Override
    protected String getPenTypeLabel() {
        return "GEL_PEN";
    }

    @Override
    protected double getInkReductionPerChar() {
        return 0.55;
    }

    @Override
    protected String refillBehavior(String oldColor, String newColor) {
        return "Gel pen cartridge replaced: " + oldColor + " -> " + newColor + ".";
    }
}
