import java.util.*;
import java.lang.*;
import java.math.BigInteger;

class Main
{
	public BigInteger factorial(int a) {
        BigInteger f = new BigInteger("1");

        for (int i = 2; i <= a; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
	Main f = new Main();
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) s.nextLong();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(" " + f.factorial(arr[j]));

        }
	}
}