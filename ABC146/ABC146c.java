import java.util.*;

public class ABC146c{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long X = sc.nextLong();
		long N = 0;
		
		if(calc(A, B, 1) <= X){
			N = 1;
			while(calc(A, B, N * 10) <= X){
				N *= 10;
			}
			N = (X - B * (long)(String.valueOf(N).length())) / A;
		}
		System.out.println(N);
	}


	public static long calc(long A, long B, long N){
		return A * N + B * (long)(String.valueOf(N).length());
	}
}
/*
定数A,Bがあり、所持金Xが与えられる。
このとき整数Nが\A*N+B*d(N)だとすると、所持金で買える最大のNは何か。
ただし、dはNの桁数とする。
*/
