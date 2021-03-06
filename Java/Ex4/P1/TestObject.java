class Rectangle{
    int height;
    int length;
    public Rectangle(int setheight, int setlength){
	height = setheight;
	length = setlength;
    }

    public int perimeter(){
	return (height + length)*2;
    }
}

class Box{
    int height;
    int length;
    int width;
    public Box(int setheight, int setlength, int setwidth){
	height = setheight;
	length = setlength;
	width = setwidth;
    }

    public int perimeter(){
	return (height + length)*2;
    }
}

public class TestObject{
    public static void main(String argv[]){
	Rectangle rectangle = new Rectangle(3, 4);
	Box box = new Box(3, 4, 5);
	System.out.println("rectangle: length=" + rectangle.length + " height=" + rectangle.height + " perimeter=" + rectangle.perimeter());
	System.out.println("box: length=" + box.length + " height=" + box.height + " width=" + box.width + " perimeter=" + box.perimeter());
    }
}
/*
How many fields does the Rectangle have? 2
How many fields does the Box have? 3
How many methods does the Rectangle have? 1
How many methods does the Box have? 1
Are there any fields with the same meaning in the Rectangle and Box classes? no
Are there any methods in the Rectangle and Box classes expressing similar behavior? yes

 */