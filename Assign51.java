

public abstract class Assign51 {
double dim1;

public abstract void findArea();
public abstract void findPerimeter();
}

 class Rectangle extends Assign51
 	{
	double length;
    double breadth;

    Rectangle(double length, double breadth)
    	{
        	this.length = length;
        	this.breadth = breadth;
    	}
    	public void findArea()
    	{
    		double i=length * breadth;
    		System.out.println("****RECTANGLE****");
    		System.out.println("The area of rectangle is ="+i);
        
    	}
    	public void findPerimeter()
    	{
    		double j = 2 * (length + breadth);
    		System.out.println("The Perimeter of rectangle is ="+j);
    		System.out.println(" ");
    	}
    	
	
 	}

 
 class Circle extends Assign51
 	{
	 double radius;
	 Circle(double radius)
	 {
		this.radius = radius;
	 }
	
	
	public void findPerimeter()
	
		{
		
		 double perimeter = 2 * Math.PI * radius;
		System.out.println("The Perimeter of Circle is ="+perimeter);
		System.out.println(" ");
		}
	
	public void findArea()
	
		{
		 double area = Math.PI * radius * radius;
		 System.out.println("****CIRCLE****");
		System.out.println("The area of Circle is ="+area);
		
		}
	
 }
 
 
 class Triangle extends Assign51
 {
	double a, b, c; 
	double Perimeter; 
	double s; 
	double Area;
	
	Triangle(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	
	}
		
	public void findPerimeter()
	{
		
	Perimeter = a + b + c;
	s = (a + b + c)/2; // Parameter/2
	System.out.println("The Perimeter of Triangle is ="+Perimeter);
	System.out.println(" ");
	}
		
	public void findArea()
	{
			
	Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("****TRIANGLE****");
	System.out.println("The Area of Triangle is ="+Area);
	
	}
 
}


