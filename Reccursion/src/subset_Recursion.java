import java.util.*;
public class subset_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
        
        int tar=sc.nextInt();
       System.out.println("\n"+printSubset(arr,0,"",0,tar)); 
	}
	
	public static int printSubset(int[] arr,int i,String ans,int sum,int tar) {
		
		  if(i==arr.length) {
			  if(sum==tar) {
				  System.out.print(ans+" ");
				  return 1;
			  }
			  return 0;
		  }
		
		int res1=printSubset(arr,i+1,ans+arr[i]+" ",sum+arr[i],tar);
		int res2=printSubset(arr,i+1,ans,sum,tar);
		
		return res1+res2;
	}

}
