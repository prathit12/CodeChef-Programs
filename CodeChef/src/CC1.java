import java.util.*;
import java.lang.*;

public class CC1 {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-->0)
        {
            long a= sc.nextLong();
            long b= sc.nextLong();
            long c= sc.nextLong();
            long d= sc.nextLong();
            long x= Math.abs(a-b);
            long y= Math.abs(c-d);

            if (y!=0){
                if(x%y==0)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            else{
                if(x==0)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }

    }
}
