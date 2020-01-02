
public class Fe19f {
//	하샤드
//	ex)126은 1+2+6으로 나눠 떨어지므로 하샤드이고 
//	123은 1+2+3으로 나눠 떨어지지 않으므로 하샤드가 아님
	
//	불리안 하샤드 메소드
//	while문으로 주어진 수를 10으로 계속 나누면 몫만 남는다.
//	그 계속 나눠서 0이되는 순간 while문 탈출
	
	public static boolean isHashard(int num) {
		int h=num;
		int sum=0;
		
		while (h!=0){
			sum=sum+h%10;
			h=h/10;
		}
		if (sum==0) {
			System.out.println("0은 양의정수가 아님");
			return false;
		}
		if (num%sum==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(isHashard(27));
		
	}
	
}
