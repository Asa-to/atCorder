import java.util.*;

public class A{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		if(X <= K * 500){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}

