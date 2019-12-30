import java.util.*;
import java.lang.Math;

public class C{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int i[][] = new int[N][2];

		for(int i = 0; i < N; i++){
			i[i][0] = sc.nextInt();
			i[i][1] = sc.nextInt();
		}

	}

	public static double calcDistance(int x1, int y1, int x2, int y2){
		return Math.cbrt(Math.pow(x2 - x1) + Math.pow(y2 - y1));
	}
