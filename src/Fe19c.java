
public class Fe19c {
	//하샤드
//	불리안 하샤드
	
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
