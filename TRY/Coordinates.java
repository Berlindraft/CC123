import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args){
        int gridsize = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X-coordinates: ");
        int x = scanner.nextInt();
        System.out.println("Enter Y-coordinates: ");
        int y = scanner.nextInt();

 while(gridsize % 2 == 0){
        System.out.println("Enter grid size: ");
        System.out.println("must be even number");
        gridsize = scanner.nextInt();
        if (x > 0 && y > 0) {
        for(int i = 0; i < gridsize; i++){
            for(int j = 0; j <gridsize; j++){
                System.out.print(" # ");
            }
            System.out.println();
        }
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
	}


    }
}
