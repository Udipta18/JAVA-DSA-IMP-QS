import java.util.*;
public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            print(n,0,0,"");
	}
	
	public static void print(int n,int st,int end,String ans) {
		
		
		if(st==n && end==n) {
			System.out.println(ans);
			return;
		}
		
		if(st<n)
		print(n,st+1,end,ans+"(");
		
		if(end<st)
			print(n,st,end+1,ans+")");
		
		
	}

}
