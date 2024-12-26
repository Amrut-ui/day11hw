package day11homework;

public class ConstructorOverloading {
	

	    private int length;
	    private int breadth;

	
	    public ConstructorOverloading () {
	        length = 0;
	        breadth = 0;
	    }

	    
	    public ConstructorOverloading(int l, int b) {
	        length = l;
	        breadth = b;
	    }

	  
	    public ConstructorOverloading(int side) {
	        length = side;
	        breadth = side;
	    }

	    public int getArea() {
	        return length * breadth;
	    }

	    public static void main(String[] args) {
	        
	    	ConstructorOverloading rect1 = new ConstructorOverloading(); 
	    	ConstructorOverloading rect2 = new ConstructorOverloading(5, 3); 
	    	ConstructorOverloading rect3 = new ConstructorOverloading(4); 

	        System.out.println("Area of rect1: " + rect1.getArea()); 
	        System.out.println("Area of rect2: " + rect2.getArea()); 
	        System.out.println("Area of rect3: " + rect3.getArea()); 
	    }
	}

