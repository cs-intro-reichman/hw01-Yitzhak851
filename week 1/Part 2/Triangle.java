
public class Triangle {
    public static void main(String[] args) {
        int x,y,z;
        // getting the sides length
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        z = Integer.parseInt(args[2]);
        boolean triangle = false;
        // check the Triangle Inequality Theorem.
        if ( (x+y > z) && (x+z > y) && (y+z > x) ){
            triangle = true;
        }

        if (triangle) {
            System.out.println( x + ", " + y + ", " + z + ": "+ triangle );
        } else {
            System.out.println( x + ", " + y + ", " + z + ": "+ triangle );
        }
    }
}
