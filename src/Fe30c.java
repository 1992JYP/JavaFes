import java.util.Scanner;

public class Fe30c {
	public static void main(String[] args) {
		
//		digit개수
		
		Scanner scan = new Scanner(System.in);
		int[] digit = {6,2,5,5,4,5,6,3,7,6};
		
		int num=0;
		int count =0;
		System.out.println("첫자리 0을 제외한 숫자를 입력하세요");
		
		num=scan.nextInt();
		
		while (num!=0) {
			for (int i=0;i<digit.length;i++) {
				if (num%10==i) {
					count=count+digit[i];
				}
			}
			num=num/10;
		}
		System.out.println("digit 개수 : "+count);
		
		scan.close();
	}
}
