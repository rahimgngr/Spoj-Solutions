import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int arr[] = new int[size];
        int arr1[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            
            while (arr[j] >= 5) {
                arr[j] = arr[j] / 5;
                arr1[j] += arr[j];
            }
        }
        for (int i = 0 ; i < arr1.length; i++) {
            System.out.println("" + arr1[i]);
        }
	}
}