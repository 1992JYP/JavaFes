import java.util.Scanner;

public class Fe32f {
	public static void main(String[] args) {
		
//		펜으로 설명 안하면 힘들다
//		
//	32번 124 나라
//		숫자 3개 = 3진법
//		3진법 구하는 방법 
//		수를 3으로 나눠서 나눈 나머지를 
//		그냥 4를 0이라고 생각해서 풀어		
//		그럼 1의자리의 0은 4야 근데
//		여기는 0이 없어
//		10진법에서 한 자리의 숫자는 9개(0제외)
//		2진법에서는 1개(0제외)
//		124에서는 근데 여기는 3개임 따라서 
//		이때 0대신 4를 쓰면 3을 쓴것과 마찬가지이므로
//		마치 뺄셈 계산할때 1을 땡겨 쓰는것 처럼
//		나머지가 0이 나올 때마다, 몫에서 1을 빼준다.
//		
		Scanner scan = new Scanner(System.in);
		int test=10;
		int n; // 나머지
		String test_s= "";
		
		System.out.println("10진법 입력");
		test=scan.nextInt();
		
		while(test>0) {
			n=test%3;
			test=test/3;
			if(n==0) {
				n=4;
				test-=1;
			}
			test_s=n+test_s;
		}
		
		System.out.println(test_s);
		
		scan.close();
		
	}
}
