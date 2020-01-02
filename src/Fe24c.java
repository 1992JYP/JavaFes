import java.util.Scanner;

public class Fe24c {
	public static void main(String[] args) {
		
//		10진->2진 변환기
		
		Scanner scan = new Scanner(System.in);
		
		int num10=0;
		int n=0;
		String num2="";
		
		System.out.println("숫자 입력 : ");
		num10=scan.nextInt();
		
		while (num10!=0) {
			n=num10%2;
			num10=num10/2;
			
			num2=n+num2;
		}
		
		
		System.out.println("2진수 : " + num2);
		
		scan.close();
		
		
	}
}
