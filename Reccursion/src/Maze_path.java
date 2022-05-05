import java.util.*;
public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int ans=	Printpath(m - 1, n - 1, 0, 0, "");
	 System.out.println("\n"+ans);

	}

	public static int Printpath(int er, int ec, int cr, int cc, String ans) {
		// er = end row, ec=end column , cc = current column ,cr =current row
		if (cc == ec && cr == er) {
			System.out.print(ans + " ");
			return 1;
		}
		if (cc > ec || cr > er) {
			return 0;
		}

	int ans1=	Printpath(er, ec, cr, cc + 1, ans + "H");
	int ans2=	Printpath(er, ec, cr + 1, cc, ans + "V");
	int ans3=	Printpath(er, ec, cr+1, cc + 1, ans + "D");
	return ans1+ans2+ans3;

	}

}
