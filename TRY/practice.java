public class practice {
    public static void main(String[] args){
//System.out.println("================================================================")

        int x = 10;
        int y = 5;
        int z = 2;

        for (int i = 0; i < 3; i++) {


            x++;            // Post-increment x
            y--;            // Post-decrement y
            z += ++x;       // Pre-increment x and add to z
            y -= --z;       // Pre-decrement z and subtract from y


            // Output current values
            System.out.println("Values after iteration " + (i + 1) + ":");
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("z: " + z);
            System.out.println();
        }

        
//System.out.println("================================================================")

//
//            int x = 10;
//            int y = 5;
//            int z = 2;
//
//            int count = 0;
//
//            while (count < 3) {
//
//
//                x++;            // Post-increment x
//                y--;            // Post-decrement y
//                z += ++x;       // Pre-increment x and add to z
//                y -= --z;       // Pre-decrement z and subtract from y
//
//
//                // Output current values
//                System.out.println("Values after iteration " + (count + 1) + ":");
//                System.out.println("x: " + x);
//                System.out.println("y: " + y);
//                System.out.println("z: " + z);
//                System.out.println();
//
//
//                count++;
//            }



//System.out.println("===============================================================")

//            int x = 10;
//            int y = 5;
//            int z = 2;
//
//            int count = 0;
//
//            do {
//
//
//                x++;            // Post-increment x
//                y--;            // Post-decrement y
//                z += ++x;       // Pre-increment x and add to z
//                y -= --z;       // Pre-decrement z and subtract from y
//
//
//
//                // Output current values
//                System.out.println("Values after iteration " + (count + 1) + ":");
//                System.out.println("x: " + x);
//                System.out.println("y: " + y);
//                 System.out.println("z: " + z);
//                System.out.println();
//
//
//                count++;
//            } while (count < 3);



//System.out.println("===============================================================")

    }
}
