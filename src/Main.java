public class Main {
    public static void main(String[] args) {
        Pen pen = PenFactory.createPen("gel", "blue", true);
        pen.start();
        pen.write("Hello LLD");
        pen.close();
        pen.refill("black");
    }
}
