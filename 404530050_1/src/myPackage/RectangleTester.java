package myPackage;
public class RectangleTester 
{

	public static void main(String[] args) 
	{
		Rectangle R1 = new Rectangle(18,57,25,15);
		R1.tostring();
		Rectangle R2 = new Rectangle(47,60,12,0);
		R2.tostring();
		System.out.println();
		System.out.println("End of Output!");
	}

}
class Rectangle
{
	static double height, width, Y, X;
	Rectangle()
	{}
	Rectangle(double h,double w,double y, double x)
	{
		this.height = getHeight(h);
		this.width = getWidth(w);
		this.Y = y;
		this.X = x;	
	}
	public void tostring()
	{
		System.out.println();
		System.out.println("java.Rectangle[x="+X+" ,y="+Y+" ,height="+height+" ,width="+width+"]");
		System.out.println("Area="+height*width);
		System.out.println("Perimeter="+(height+width)*2);
	}
	public double getHeight(double h)
	{
		return h;
	}
	public double getWidth(double w)
	{
		return w;
	}

}