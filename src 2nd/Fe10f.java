import java.util.Scanner;

public class Fe10f {
	public static void main(String[] args) {
//		최대 공약수, 최소공배수
//		
		Scanner scan=new Scanner(System.in);
		
		int maxD=0;//최대공약수
		int minT=0;//최소공배수
		
		int num1=0;//첫번째 입력
		int num2=0;//두번째 입력
		
		System.out.println("최대공약수, 최소공배수 구하기");
		System.out.print("숫자 1 : ");
		num1=scan.nextInt();
		System.out.print("숫자 3 : ");
		num2=scan.nextInt();
		
		int low=0;	//입력된 값중에 작은값
		int high=0;	//입력된 값중에 큰값
		
		
		if(num1<num2) {
			low=num1;
			high=num2;
		}
		else {
			low=num2;
			high=num1;
		}
//		최소공약수 찾기
//		큰 수와 작은 수를 나누는데
//		작은수부터 1씩빼가면서 
//		둘다 나눠 떨어지면 최대공약수 등록, break
		for(int i=low;i>0;i--) {
			if(low%i==0) {
				if(high%i==0) {
					maxD=i;
					break;
				}
			}
		}
		
		minT=num1*num2/maxD;
		
		System.out.println("최대공약수 : "+maxD+"최소공배수 : "+minT);
		
		
		scan.close();
	}
}
