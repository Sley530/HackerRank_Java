import java.io.*;
import java.util.*;

/**
 * @author Sley
 *
 */

public class Std_io_2 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        String str = scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }

}
