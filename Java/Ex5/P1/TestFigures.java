class Shape {
  private String name;
  public Shape(String name) {
    this.name = name;
  }
  public Shape() {
    name = "no name";
  }
  public String getName() {
    return name;
  }
  public String toString() {
    return getClass().getName() + " " + name;
  }
}

class Circle extends Shape {
    protected double radius;
    public Circle(){
	super();
    }
    public Circle(double r){
	super();
	radius = r;
    }
    public Circle(double r, String name){
	super(name);
	radius = r;
    }
    public String toString(){
	return getClass().getName() + " " + getName();
    }
    public double getRadius() {
	return radius;
    }
    public double getArea() {
	return radius*radius*Math.PI;
    }
    public double getPerimeter() {
	return 2*radius*Math.PI;
    }
}

class Rectangle extends Shape {
    protected double side1, side2;
    public Rectangle(){
	super();
    }
    public Rectangle(String name){
	super(name);
    }
    public Rectangle(double s1, double s2){
	super();
	side1 = s1;
	side2 = s2;
    }
    public Rectangle(double s1, double s2, String name){
	super(name);
	side1 = s1;
	side2 = s2;
    }
    public String toString(){
	return getClass().getName() + " " + getName();
    }
    public double getSide1() {
	return side1;
    }
    public double getSide2() {
	return side2;
    }
    public double getArea() {
	return side1*side2;
    }
    public double getPerimeter() {
	return (side1+side2)*2;
    }
}

class Square extends Rectangle {
    public Square(double s1){
	super(s1,s1);
    }
    public Square(){
	super();
    }
    public Square(String name){
	super(name);
    }
    public Square(double s1, String name){
	super(s1,s1,name);
    }
}

class Parallelogram extends Rectangle {
    protected double diagonal;
    public Parallelogram(double s1, double s2, double d){
	super(s1, s2);
	diagonal = d;
    }
    public Parallelogram(double s1, double s2, double d, String name){
	super(s1, s2, name);
	diagonal = d;
    }
    public double getDiagonal() {
	return diagonal;
    }
    public double getArea() {
	double s;
	s = (side1 + side2 + diagonal) / 2.0;
	return Math.sqrt(s*(s-side1)*(s-side2)*(s-diagonal)) * 2;
    }
}

class Rhombus extends Square {
    protected double diagonal;
    public Rhombus(double s1, double d){
	super(s1);
	diagonal = d;
    }
    public Rhombus(double s1, double d, String name){
	super(s1,name);
	diagonal = d;
    }
    public String toString(){
	return getClass().getName() + " " + getName();
    }
    public double getDiagonal() {
	return diagonal;
    }
    public double getArea() {
	double s;
	s = (side1 + side2 + diagonal) / 2.0;
	return Math.sqrt(s*(s-side1)*(s-side2)*(s-diagonal)) * 2;
    }
}

public class TestFigures{
    public static void main(String argv[]){
	Circle circle = new Circle(3, "maru");
	Rectangle rect = new Rectangle(3,4, "tyohou");
	Square squ = new Square(4, "rippou");
	Parallelogram para = new Parallelogram(4,5,6,"heikou");
	Rhombus rhom = new Rhombus(4,5,"hishi");
	System.out.println(circle.toString() + ": radius" + circle.getRadius() + " Area" + circle.getArea() + " Perimeter" + circle.getPerimeter());
	System.out.println(rect.toString() + ": side1 " + rect.getSide1() +  " side2 " + rect.getSide2() + " Area" + rect.getArea() + " Perimeter" + rect.getPerimeter());
	System.out.println(squ.toString() + ": side" + squ.getSide1() + " Area" + squ.getArea() + " Perimeter" + squ.getPerimeter());
	System.out.println(para.toString() + ": side1 " + para.getSide1() +  " side2 " + para.getSide2() + " diagonal" + para.getDiagonal() +" Area" + para.getArea() + " Perimeter" + para.getPerimeter());
	System.out.println(rhom.toString() + ": side1 " + rhom.getSide1() +  " diagonal" + rhom.getDiagonal() + " Area" + rhom.getArea() + " Perimeter" + rhom.getPerimeter());
    }
}