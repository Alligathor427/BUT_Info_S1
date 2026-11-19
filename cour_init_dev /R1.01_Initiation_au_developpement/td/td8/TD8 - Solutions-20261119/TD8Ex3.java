public class TD8Ex3 {
	public static int [][] pascal(int n) {
		int [][] p = new int[n][n+1];
		for (int i=0; i<n; ++i)
			for (int j=0; j<n+1; ++j)
				p[i][j] = 0;
		p[0][1] = 1;
		for (int i=1; i<n; ++i)
			for (int j=1; j<=i+1; ++j)
				p[i][j] = p[i-1][j-1] + p[i-1][j];
		return p;
	}

	public static void display(int [][] t) {
		for (int i=0; i<t.length; ++i) {
			for (int j=0; j<t[i].length; ++j) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String [] args) {
		int [][] p = pascal(7);
		display(p);
	}
}
