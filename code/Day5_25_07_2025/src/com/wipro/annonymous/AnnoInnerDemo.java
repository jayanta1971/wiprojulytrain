package com.wipro.annonymous;

public class AnnoInnerDemo {

	public static void main(String[] args) {
		 
		
		Shape rectangle= new Shape() {
			//nameless -> Anonymous
			//inner class
			//Anonymous inner class
			@Override
			public void draw() {
				System.out.println("Drawing Rectangle");			
			}	 		
			
		};		
		rectangle.draw();
		
		Shape r=()->System.out.println("Drawing Lambda Rectangle"); 
		
		r.draw();
		
		
		
		
		Shape circle= new Shape() {

			@Override
			public void draw() {
				System.out.println("Drawing Circle");
				
			}

		 
			
			
		};
		
		circle.draw();
		
		Shape square= new Shape() {

			@Override
			public void draw() {
				 System.out.println("Drawing square");
				
			}

		 
		};
		
		square.draw();
		
		
		
	}
}