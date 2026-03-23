abstract class Pen {
    private String inkColor;
    private final boolean hasCap;
    private boolean started;
    private double inkLevel;

    protected Pen(String inkColor, boolean hasCap) {
        if (inkColor == null || inkColor.trim().isEmpty()) {
            throw new IllegalArgumentException("Ink color is required");
        }
        this.inkColor = inkColor.trim();
        this.hasCap = hasCap;
        this.started = false;
        this.inkLevel = 100.0;
    }

    public void start() {
        if (started) {
            return;
        }

        if (hasCap) {
            System.out.println(getPenTypeLabel() + " -> Uncapping pen.");
        } else {
            System.out.println(getPenTypeLabel() + " -> Clicking pen open.");
        }
        started = true;
    }

    public void write(String text) {
        if (!started) {
            throw new IllegalStateException("Start the pen before writing");
        }
        if (inkLevel <= 0) {
            throw new IllegalStateException("Ink is empty. Refill required");
        }
        if (text == null || text.isEmpty()) {
            return;
        }

        double inkUsed = Math.max(1.0, text.length() * getInkReductionPerChar());
        if (inkUsed > inkLevel) {
            throw new IllegalStateException("Not enough ink for this write operation");
        }

        inkLevel -= inkUsed;
        System.out.println("[" + getPenTypeLabel() + "] " + text);
        System.out.printf("Ink left: %.2f%%%n", inkLevel);
    }

    public void close() {
        if (!started) {
            return;
        }

        if (hasCap) {
            System.out.println(getPenTypeLabel() + " -> Capping pen.");
        } else {
            System.out.println(getPenTypeLabel() + " -> Clicking pen closed.");
        }
        started = false;
    }

    public void refill(String newInkColor) {
        if (newInkColor == null || newInkColor.trim().isEmpty()) {
            throw new IllegalArgumentException("Refill color is required");
        }

        String previousColor = inkColor;
        inkColor = newInkColor.trim();
        inkLevel = 100.0;
        System.out.println(refillBehavior(previousColor, inkColor));
    }

    public String getInkColor() {
        return inkColor;
    }

    public double getInkLevel() {
        return inkLevel;
    }

    protected abstract String getPenTypeLabel();

    protected abstract double getInkReductionPerChar();

    protected abstract String refillBehavior(String oldColor, String newColor);
}