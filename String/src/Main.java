import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    	String s1=sc.next();
    	String s2="";
    	for(int i=0;i<s1.length()-1;i++) {
    		if(s1.charAt(i)!=s1.charAt(i+1)) {
    			s2=s2+s1.charAt(i);
    		}
    	}
    	  s2=s2+s1.charAt(s1.length()-1);
    	
    	System.out.println(s2);
	}

}
