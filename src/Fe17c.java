import java.util.Scanner;

public class Fe17c {

	public static void main(String[] args) {

//		�������� ���� 1
		
		Scanner scan= new Scanner(System.in);
		
		int num=0;
		
		
		System.out.println("� ���?");
		num=scan.nextInt();
		
		int printed=1;
		for(int i=0; i<num;i++) {
			printed=printed+i;
			System.out.print(printed+" ");
		}
		
		
		scan.close();
	}

}