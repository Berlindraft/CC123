public class Coordinates {
    public static void main (String [] args) {

    System.out.print("Enter x-coordinate: ");
    int x = Zyron.readInt();
    System.out.print("Enter y-coordinate: ");
    int y = Zyron.readInt();

	    if (x > 0 && y > 0) 
	    {
		System.out.println("("+x+","+y+") lies in the first quadrant");
	    }
	    else if(x < 0 && y < 0)
	    {
		System.out.println("("+x+","+y+") lies in the third quadrant");
	    }
	    else if(x < 0 && y > 0) 
	    {
		System.out.println("("+x+","+y+") lies in the second quadrant");
	    }
	    else if(x > 0 && y < 0) 
	    {
		System.out.println("("+x+","+y+") lies in the fourth quadrant");
	    }
	    else if(x == 0 && y == 0)
	    {
		System.out.println("("+x+","+y+") lies in the origin");
	    }
	    else if(x == 0 && y > 0 || y < 0) 
	    {
		System.out.println("("+x+","+y+") lies in the y-axis");
	    }
	    else if(y == 0 && x > 0 || x < 0) 
	    {
		System.out.println("("+x+","+y+") lies in the x-axis");
	    }
    }
}