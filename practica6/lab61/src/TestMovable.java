public class TestMovable {
    public TestMovable() {
    }

    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 5, 6, 10);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        Movable m2 = new MovableCircle(2, 1, 2, -3, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        Movable m4 = new MovablePoint(3, 3, 8, 11);
        Movable m3 = new MovableRectangle((MovablePoint)m4, (MovablePoint)m4);
        System.out.println(m3);
        m3.moveUp();
        System.out.println(m3);
    }
}