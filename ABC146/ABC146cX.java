import java.util.*;

/*
   キャストを多用したくないので変数は基本longで扱う。
 */
public class ABC146cX{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long X = sc.nextLong();
		long N;

		N = calcMaximumPrice(A, B, X);

		System.out.println(N);
	}

	public static long calcMaximumPrice(long A, long B, long X){
		//予算で買える最大の整数を計算
		//二部探査で割り出す
		long right = 1000000000;//10^9
		long left = 0;
		long N = 1;

		if(calcPrice(A, B, right) <= X)return right;
		if(calcPrice(A, B, N) > X )return 0;
		while(left + 1 < right){
			N = (left + right) / 2;
			if(calcPrice(A, B, N) < X){//答えがNより右側にあることがわかったら
				left = N;//左をNまで寄せる
			}else if(calcPrice(A, B, N) > X){//答えがNより左側にあることがわかった
				right = N;//右側をNまで寄せる
			}else{
				return N;
			}
		}
		if(calcPrice(A, B, N) > X)N --;
		return N;

	}

	public static long calcKeta(long N){
		//Nの桁数を計算
		long keta;
		keta = String.valueOf(N).length();
		return keta;
	}

	public static long calcPrice(long A, long B, long N){
		//値段を計算
		return A * N + B * calcKeta(N);
	}
}
