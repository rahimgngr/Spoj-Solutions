import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
           long n1 = s.nextInt();
           long n2 = s.nextInt();
           
           long sum = 0;

            if (n1 > n2) {
                long temp;
                temp = n1;
                n1 = n2;
                n2 = temp;
            }
            for (long j = n1; j < n2 + 1; j++) {
                sum += j;

            }
            
            System.out.println("" + sum);
            //sum = 0;

        }

	}
}