import java.util.Scanner;

public class Fe17f {

	public static void main(String[] args) {

//		계차수열 계차 1
//		i는 1씩 증가하므로
//		원래 수에 i를 더하고 그때그때 출력하면 그게 계차수열임
		
		Scanner scan= new Scanner(System.in);
		
		int num=0;
		
		
		System.out.println("몇개 출력?");
		num=scan.nextInt();
		
		int printed=1;
		for(int i=0; i<num;i++) {
			printed=printed+i;
			System.out.print(printed+" ");
		}
		
		
		scan.close();
	}

}
