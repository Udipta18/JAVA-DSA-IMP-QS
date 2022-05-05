import java.util.*;
public class Subarray_Product_Less_Than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int k=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(noOfSubArray(arr,k));

	}
	
	
	public static int noOfSubArray(int[] arr,int k) {
		int ei=0;
		int si=0;
		int p=1;
		int count=0;
		while(ei<arr.length) {
			
			p=p*arr[ei];
			
			while(p>=k && si<=ei) {
				p=p/arr[si];
				si++;
			}
			
			count+=ei-si+1;
			
			ei++;
			
			
		}
		
		return count;
	}

}
