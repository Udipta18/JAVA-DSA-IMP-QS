import java.util.*;
public class So {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		while(n-- >0) {
			String a=sc.nextLine();
			String b=sc.nextLine();
			char[] ch1=a.toCharArray();
			char[] ch2=b.toCharArray();
			System.out.println(possibleornot(ch1,ch2));
		}
		
		

	}
	
	
	public static String possibleornot(char[] a,char[] b) {
		for(int i=0;i<a.length;i++) {
			if(a[i]=='*' && b[i]!='*') {
				char ch=b[i];
				a[i]=ch;
			}
			if(b[i]=='*' && a[i]!='*') {
				char ch=a[i];
				b[i]=ch;
			}
		}
		
		 String str11 = String.copyValueOf(a);
		 String str12 = String.copyValueOf(b);
		if(str11.equalsIgnoreCase(str12)) {
			return "true";
		}
		else
			return "false";
	}

}
