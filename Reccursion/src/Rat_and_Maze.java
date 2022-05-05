import java.util.Scanner;

public class Rat_and_Maze {

	static boolean f = false;
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] ch = new char[n][m];
		for (int i = 0; i < ch.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				ch[i][j] = s.charAt(j);
			}
		}

			int[][] ans = new int[n][m];
			printPath(ch, 0, 0, ans);
			if(f==false) {
				System.out.print("NO PATH FOUND");
			}

		

	}

	public static void printPath(char[][] maze, int cr, int cc, int[][] ans) {

		if (cc == maze[0].length - 1 && cr == maze.length - 1) {
			if (maze[cr][cc] == 'O') {
				f = true;
				ans[cr][cc] = 1;
				count++;
				display(ans,count);
				ans[cr][cc] = 0;
			}
			return;
		}

		if (cc < 0 || cc >= maze[0].length || cr < 0 || cr >= maze.length || maze[cr][cc] == 'X') {
			return;
		}

		int[] r = { 0, -1, 0, 1 };
		int[] c = { 1, 0, -1, 0 };

		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		for (int i = 0; i < r.length; i++) {
			printPath(maze, cr + r[i], cc + c[i], ans);
		}
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}
	
	public static void display(int[][] ans,int count) {
		if(count==1) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		}
		
		
	}

}
