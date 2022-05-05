import java.util.*;

public class Recursion_Keypad_Codes {

	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };
	static int count=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		print(str,"");
		System.out.println("\n"+count);

	}
	
	public static void print(String str,String ans) {
		
		  if(str.length()==0) {
			  System.out.print(ans+" ");
			  count++;
			  return;
		  }
		
		
		char ch=str.charAt(0);
		String string=key[ch-48];
		for(int i=0;i<string.length();i++) {
			print(str.substring(1),ans+string.charAt(i));
		}
		
	}

}
