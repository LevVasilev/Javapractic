public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball();
        System.out.println(b);
        b.setXY(2.2, 3.8);
        System.out.println(b);
        b.move(12, -4);
        System.out.println(b);
    }
}