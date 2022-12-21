
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public void moveUp() {
        MovablePoint var10000 = this.center;
        var10000.y -= this.center.ySpeed;
    }

    public void moveDown() {
        MovablePoint var10000 = this.center;
        var10000.y += this.center.ySpeed;
    }

    public void moveLeft() {
        MovablePoint var10000 = this.center;
        var10000.x -= this.center.xSpeed;
    }

    public void moveRight() {
        MovablePoint var10000 = this.center;
        var10000.x += this.center.xSpeed;
    }

    public String toString() {
        return "MovableCircle{radius=" + this.radius + ", center=" + this.center + "}";
    }
}
