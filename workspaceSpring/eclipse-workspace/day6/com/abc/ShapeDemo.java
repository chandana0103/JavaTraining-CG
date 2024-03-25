package com.abc;

public class ShapeDemo {

	public static void main(String[] args) {
		
//		Circle circle1 = new Circle(5);
//		Rectangle rect1 = new Rectangle(2,3);
//		Cube cube1 = new Cube(7);
//		Circle circle2 = new Circle(4);
//		Rectangle rect2 = new Rectangle(3,3);
//		Cube cube2 = new Cube(6);
//		Circle circle3 = new Circle(9);
//		Rectangle rect3 = new Rectangle(6,2);
//		Cube cube3 = new Cube(8);
////		
//		Circle[] cAry = new Circle[3];
//		cAry[0] = circle1;
//		cAry[1] = circle2;
//		cAry[2] = circle3;
		
//		Rectangle[] rAry = new Rectangle[3];
		
		
		Shape[] shape = new Shape[6];
		shape[0] = new Circle(5);
		shape[1] = new Rectangle(2,3);
		shape[2] = new Cube(7);
		shape[3] = new Rectangle(3,3);
		shape[4] = new Cube(8);
		shape[5] = new Circle(9);
		
		for(int i=0;i<shape.length;i++) {
			double area = shape[i].area();
			System.out.println("Area: "+area);
			if(shape[i] instanceof SolidShape) {
				double volume = shape[i].volume();
				System.out.println("Volum: "+volume);
			}
			else {
				System.out.println("n/a");
			}
			
		}
		

	}

}
