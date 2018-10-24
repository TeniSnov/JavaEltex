import java.util.*;
class Calc{
	public static void main(String[] args){
		int a=0, b=0, c=0;
		String s;
		Scanner in = new Scanner(System.in);
		s = in.next();
		for(int i=0; i<s.length();i++){
			if(i == 0){
				a = Integer.valueOf(String.valueOf(s.toCharArray()[i]));
			}
			if(i == 2){
				b = Integer.valueOf(String.valueOf(s.toCharArray()[i]));
			}
		}
		System.out.println(a);
		System.out.println(b);
		switch(s.toCharArray()[1]){
			case '+': c=a+b; break;
			case '/': c=a/b; break;
			case '-': c=a-b; break;
			case '*': c=a*b; break;
		}
		System.out.println(c);
	}
};
