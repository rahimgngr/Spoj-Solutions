import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        ArrayList<String> n = new ArrayList<>();

        if (size > 0 && size < 50) {
            n.add("W");
            for (int i = 0; i < size; i++) {
                n.add("o");
            }
            n.add("w");
        }

        /*for (int j = 0; j < n.size(); j++) {
            System.out.print(" " + n.get(j).);
        }*/
        //System.out.print(n.toString().replace(",", "").replace("[", "").replace("]", "").trim());
        StringBuilder builder = new StringBuilder();
        n.forEach((value) -> {
            builder.append(value);
        });
        String text = builder.toString();
        System.out.println("" + text);
	}
}