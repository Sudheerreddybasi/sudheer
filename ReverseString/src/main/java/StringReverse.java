import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		int l=s.length();
		String str="";
		for(int i=l-1;i>=0;i--) {
			 str=str+s.charAt(i);
		}
		System.out.println(str);

	}

}
