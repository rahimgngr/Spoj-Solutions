import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = new int[300];
        int arr2[] = new int[300];
        int arr3[] = new int[300];
        int counter = 0;
        boolean flag;
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int size2 = s.nextInt();
        for (int j = 0; j < size2; j++) {
            arr2[j] = s.nextInt();
        }
        for (int i = 0; i < size; i++) {
            flag = true;
            for (int j = 0; j < size2; j++) {
                if (arr[i] == arr2[j]) {
                    
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.print(" " + arr[i]);
            }

        }
	}
}
