import java.util.*;
import java.lang.Math;

public class C{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N]; 
		for(int i = 0; i < N; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++){
			b[i] = sc.nextInt();
		}
		/*
		 * 標準入力を正規化する
		 */
		int P = inputNormaliz(a);
		int Q = inputNormaliz(b);
		/*
		 * 大きさNの順列をN進数になおして何番目かを突き止める。(進数変換したら0になるまで1引けばけばいい)
		 * 引き算して出力する
		 */
		System.out.println(Math.abs(rank(normaliz(P) - rank(normaliz(Q)))));
	}

	private static int inputNormaliz(int[] a){
		int N = 0;
		int temp = (int)Math.pow(10,a.length - 1);
		for(int i = 0; i < a.length; i++){
			N += a[i] * temp;
			temp /= 10;
		}
		return N;
	}

	private static int normaliz(int line){
		/* lineの全ての桁を独立した数字とみなして、全ての桁から1を引く*/
		int N = calcKeta(line);
		for(int i = 1; i < Math.pow(10, N);i *= 10){
			line -= i;
		}
		System.out.println(line);
		return line;
	}

	private static int rank(int line){
		/* 正規化したなんちゃって数列が何番目なのか数える
		 * 全部の桁を独立した数として足すだけ */
		int sum = 0;
		String temp = String.valueOf(line);
		char moji[] = temp.toCharArray();
		for(int i = 0;i < moji.length; i ++){
			sum += (int)moji[i] - (int)('0');
		}
		return sum;
	}

	private static int calcKeta(int N){
		return String.valueOf(N).length();
	}
}
