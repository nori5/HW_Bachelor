public class Point extends Figure{
    private int x = 0;
    private int y = 0;

    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }

    public void move(int x, int y) {
	this.x = x;
	this.y = y;
    }
    public double getArea() {
	return 0;
    }
}