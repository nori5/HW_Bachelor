public class Rectangle extends Figure {
    private double w, h;
    private Point origin; 
    public Rectangle(){
	super();
	origin = new Point(0, 0);
    }
    public Rectangle(double s1, double s2){
	super();
	origin = new Point(0, 0);
	w = s1;
	h = s2;
    }
    public void move(int x, int y) {
	origin.move(x,y);
    }
    public double getw() {
	return w;
    }
    public double geth() {
	return h;
    }
    public double getArea() {
	return w*h;
    }
}