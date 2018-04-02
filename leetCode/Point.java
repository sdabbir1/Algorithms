package Testhere;

public class Point {

	protected int x;
	protected int y;
	public Point (int x, int y) 
	{ 
		this.x = x; 
		this.y = y; 
	}
	
	public void A()
	{
		System.out.println("P::test");
	}
	
public Point() {
		// TODO Auto-generated constructor stub
	}

public static class ColorPoint extends Point
{

	protected int color;
	   public ColorPoint(int x, int y, int color)  
	   { 
		   super(x,y); 
		   this.color = color; 
	   }
	public ColorPoint() {
		// TODO Auto-generated constructor stub
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	public void A()
	{
		System.out.println("cp::test");
	}

	
}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ColorPoint pa = new ColorPoint(1,2,3);      //Line 0
        Point pb = new Point(4,5);   
        Point a = new ColorPoint();
        a.A();
        // pa = pb;                           // Line 1
        // pb = pa;                           // Line 2
        // pa = (ColorPoint)pb;       // Line 3               
        // pb = (Point)pa;                // Line 4  
        //System.out.println(pb.x);
		
		/*Point P1 = new Point();
		ColorPoint P2 =  (ColorPoint)P1;
		int x = P2.getColor();*/

	}

}
