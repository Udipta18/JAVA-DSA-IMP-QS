import java.util.*;
public class boardPath {
  public static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
             int m=sc.nextInt();
          String ans="";       
           print(0,n,m,ans);
           System.out.println("\n"+count);
           
	}
	
	public static void print(int sum,int num,int si,String ans){
		
		if(sum==num) {
			System.out.print(ans+" ");
			count++;
			return ;
		}
		if(sum>num) {
			return;
		}
		
		for(int i=1;i<=si;i++) {
			
			print((sum+i),num,si,ans+i);
			
		}
	
	}

}
