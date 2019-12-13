import java.util.*;

public class ABC146cX{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long X = sc.nextLong();
		long N = 0;
		if(canBuy(calc(A, B, N), X)){
			N = 1;
		}
		System.out.println(calc(A, B, binarySearch(N, A, B, X)));
	}

	public static long binarySearch(long N, long A, long B, long X){
		long lower = N;
		long upper = N * 10 - 1; 
		long mid = lower;

		for(int i = 0; i < 15; i++){
			mid = (upper + lower) / 2;
			if(canBuy(calc(A, B, mid), X)){
				lower = mid;
			}else {
				upper = mid;
			}
		}

		return mid;
	}

	public static boolean canBuy(long price, long myMoney){
		if(price <= myMoney)return true;
		return false;
	}

	public static long calc(long A, long B, long N){
		return A*N+B*(long)(calcKeta(N));
	}

	public static int calcKeta(long N){
		return (int)(String.valueOf(N).length());
	}
}
