package practice;
import java.util.*;
public class StringBalanced {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st = sc.nextLine();
		sc.close();
		boolean rs = isBalanced(st);
		if(rs)
			System.out.println(st + " is balanced");
		else
			System.out.println((st + " is not balanced"));
	}
	private static boolean isBalanced(String st) {
		Stack<Character> stk = new Stack<Character>();
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
				stk.push(ch);
			else {
				if(stk.isEmpty())
					return false;
				switch (ch) {
				case '}':if(stk.pop()!='{')
					return false;
				break;
				case ')':if(stk.pop()!='(')
					return false;
				break;
				case ']':if(stk.pop()!='[')
					return false;
				break;
				}
			}
		}
		return stk.isEmpty();
	}
}
