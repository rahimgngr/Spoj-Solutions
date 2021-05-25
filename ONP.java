import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		while (count-- > 0) {
			String exp = in.next();
			int strLength = exp.length();
			int counter = -1;
			Stack<Character> st = new Stack<Character>();
			String output = "";
			while (counter++ < strLength - 1) {

				if (exp.charAt(counter) == '(')
					continue;

				char test = exp.charAt(counter);

				if (test == '+' || test == '-' || test == '*' || test == '/'
						|| test == '^') {
					st.add(test);
					continue;
				} else if (test == ')') {
					output += st.pop();
					continue;
				} else {
					output += String.valueOf(test);
					continue;
				}

			}
			System.out.println(output.trim());

		}

	}

}