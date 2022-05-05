import java.util.*;
public class codes_String_of_String {
	static String[] arr = { "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "s", "t", "u", "v", "w", "x", "y", "z" };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            String str=sc.next();
            ArrayList<String> list=new ArrayList<>();
            print(str,"",list);
            System.out.println(list);
            
            
	}
	
	public static void print(String str,String ans, ArrayList<String> list) {
		
		   if(str.length()==0) {
			   list.add(ans);
			   return;
		   }
		
		
		char ch=str.charAt(0);
		String s=arr[ch-48];
		print(str.substring(1),ans+s,list);
		
		if(str.length()>=2) {
			String st=str.substring(0,2);
			int n=Integer.parseInt(st);
			if(n<=26) {
				print(str.substring(2),ans+arr[n],list);
			}
			
		}
	}

}
