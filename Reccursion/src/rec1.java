import java.util.*;
public class rec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		int item=sc.nextInt();
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		
		ArrayList<Integer> ans=allIndex(arr,0,item,li);

		if(ans.get(0)!=null) {
			  for (Integer i : ans)
				  
		            // Printing the elements of ArrayList
		            System.out.print(i + " ");
		}
		else {
			System.out.print(-1);
		}
		

	}
	
	public static ArrayList<Integer> allIndex(int[] arr,int i,int item,ArrayList<Integer> li){
		if(i==arr.length) {
			return li;
		}
		
		if(arr[i]==item) {
		   li .add(i);
		}
		
		return allIndex(arr,i+1,item,li);
		
	}

}
