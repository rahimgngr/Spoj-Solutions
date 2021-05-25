import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        String arr;
        while (true) {
            arr = s.nextLine();
            if (arr.equals("42")) {
                break;
            }
            System.out.println("" + arr);
        }
		
	}
}