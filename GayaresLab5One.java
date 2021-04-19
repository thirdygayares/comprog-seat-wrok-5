
class Shape{
	void draw(){
		System.out.println("There are Three Shapes");
	}
	void erase(){
		System.out.println("Caution: Erasing is processing...");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("This is Circle");
	}
	void erase(){
		System.out.println("Circle is Deleted");
	}
	
}

class Triangle extends Shape{
	void draw(){
		System.out.println("This is Triangle");
	}
	void erase(){
		System.out.println("Triangle is Deleted");
	}
}

class Square extends Shape{
	void draw(){
		System.out.println("This is Square");
	}
	void erase(){
		System.out.println("Square is Deleted");
	}
}

public class GayaresLab5One {
	public static void main(String[] args) {
		Shape myShape = new Shape();
		Shape myCircle = new Circle();
		Shape myTriangle = new Triangle();
		Shape mySquare = new Square();
		
		//to draw
		myShape.draw();
		System.out.println();
		myCircle.draw();
		myTriangle.draw();
		mySquare.draw();
		
		
		//to delete
		System.out.println();
		myShape.erase();
		System.out.println();
		myCircle.erase();
		myTriangle.erase();
		mySquare.erase();
		
	}
}
