import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int sum[] = new int[size];

        int arr[][] = new int[size][2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                int first = arr[i][j];
                int second = 0;
                while (first != 0) {
                    second = 10 * second + first % 10;
                    first /= 10;
                }
                sum[i] += second;
            }
        }
        for (int i = 0; i < size; i++) {
            int f = sum[i];
            int s = 0;
            while (f != 0) {
                s = 10 * s + f % 10;
                f /= 10;
            }
            sum[i] = s;
            System.out.println("" + sum[i]);
        }
	}
}