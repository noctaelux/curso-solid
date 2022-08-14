package com.company.liskov_1;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
		
		useRectangle(square);

	}

	private static void useRectangle(Rectangle rectangle) {
		rectangle.setHeight(20);
		rectangle.setWidth(30);

		if(rectangle.getHeight() != 20){
			System.out.println("Height not equal to 20");
		}
		if(rectangle.getWidth() != 30){
			System.out.println("Width not equal to 30");
		}
	}
}
