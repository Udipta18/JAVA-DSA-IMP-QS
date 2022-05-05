import java.util.*;
public class Shibam {
//public static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		int[] arr= {1,13,2,31,17};
		int n=5;
		

	}
	
	
	public static int countEmirp(int[] arr,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>9 && isprime(arr[i])){
				int n1=reverse(arr[i]);
				if(isprime(n1)) {
					count++;
				}
			}
					
			
		}
		System.out.println("Output is"+" "+count); 
		return count;
	}
	
	public static boolean isprime(int n) {

		int div = 2;
		while (div * div <= n) {

			if (n % div == 0) {
				return false;
			}
			div++;

		}

		return true;

	}
	
	public static int reverse(int n){
        
	      int rev = 0; // reversed number
	      int rem;   // remainder
	        
	      while(n>0){
	           
	        rem = n%10;
	        rev = (rev*10) + rem;
	        n = n/10;
	      }
	        
	      return rev;
	    }

}
