import java.io.*;
import java.util.*;

public class Std_io {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        double num = scan.nextDouble();
        int integer = scan.nextInt();
        scan.close();

        System.out.println("String: " + str);
        System.out.println("Double: " + num);
        System.out.println("Int: " + integer);

    }
    }
}


}
