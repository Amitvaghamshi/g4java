package problems;

public class MaxCut {

	public static void main(String[] args) {
		int n=12;
		
		int half=n/2;
		int h=half;
		int v=n-h;
		
		int total=(h+1)*(v+1);
		System.out.println(total);
	}
}
