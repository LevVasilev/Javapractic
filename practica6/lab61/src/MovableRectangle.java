public class MovableRectangle implements Movable {
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public void moveUp() {
        MovablePoint var10000 = this.topLeft;
        var10000.y -= this.topLeft.ySpeed;
        var10000 = this.bottomRight;
        var10000.y -= this.topLeft.ySpeed;
    }

    public void moveDown() {
        MovablePoint var10000 = this.topLeft;
        var10000.y += this.topLeft.ySpeed;
        var10000 = this.bottomRight;
        var10000.x += this.topLeft.xSpeed;
    }

    public void moveLeft() {
        MovablePoint var10000 = this.topLeft;
        var10000.x -= this.topLeft.xSpeed;
        var10000 = this.bottomRight;
        var10000.x -= this.topLeft.xSpeed;
    }

    public void moveRight() {
        MovablePoint var10000 = this.topLeft;
        var10000.x += this.topLeft.xSpeed;
        var10000 = this.bottomRight;
        var10000.x += this.topLeft.xSpeed;
    }

    public String toString() {
        return "MovableRectangle{topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + "}";
    }
}
