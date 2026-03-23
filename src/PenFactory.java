public class PenFactory {

    public static Pen createPen(String type, String color, boolean hasCap) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Pen type is required");
        }

        switch (type.trim().toLowerCase()) {
            case "ball":
            case "ballpoint":
            case "ballpen":
                return new BallPen(color, hasCap);
            case "gel":
            case "gelpen":
                return new GelPen(color, hasCap);
            case "fountain":
            case "fountainpen":
                return new FountainPen(color, hasCap);
            default:
                throw new IllegalArgumentException("Unsupported pen type: " + type);
        }
    }
}
