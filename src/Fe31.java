import java.util.Scanner;

public class Fe31 {
	public static void main(String[] args) {
		
//		caeser ��ȣ����� 
//		�ƽ�Ű�ڵ� ���� �ʿ�
//		�ƽ�Ű A �� ������ ��
//		���ʿ� �̰� �˾ƾ� �Ѵٴ°� ��ü�� �ǹ���
//		���ĺ��� 26��
//		�빮�� Z������ �ҹ��� a �ΰ� ������ �˰� �ִ�.
//		���ϴ°� �빮��Z���� ��ĭ ������Ű�� �ҹ��� a�� �����ϱ�
//		�빮�ڰ� �ҹ��ڰ� �Ǹ� -26�� ���ְ�  �ƽ�Ű�ڵ带 15��� ġ��
//		�ҹ��ڰ� �ٸ����ڰ� �Ǹ� -26�� ���ְ� 
//		���� 26���� ���� �������� ����??\
//		A�ƽ�Ű�ڵ尡 ���� 15��� ġ��
//		a�ƽ�Ű�ڵ�� 41�ϰ���
//		Ȯ���غ� �ƴϳ�.. ����
//		�߸��˰��־���
		
//		�ٽ� �����غ���
//		�׷� �ᱹ ��ġ���� ���̳� ���
//		'a'+'a'-'a'='a'�ϱ�
//		a���� z���� 26���� ���� �������� ������
//		'a'�� 65�� 'z'�� 90�̴ϱ�
//		a%26+a=.... �𸣰ڴ�.. �������� ����...
//		
//		��������....
		
		Scanner scan = new Scanner(System.in);
		
		String sol;
		char[] pw;
		int pwn;
		
		
		System.out.println("���� �Է�");
		sol=scan.nextLine();
		System.out.println("ĭ �� �Է�");
		pwn=scan.nextInt();
		
		pw=sol.toCharArray();
		
		for(int i=0;i<pw.length;i++) {
			System.out.println(pw[i]+"*");
		}
		
		for(int i=0; i<pw.length;i++) {
			if(pw[i]!=' ') {
				System.out.print((char)(pwn+pw[i]));
			}
		}
		
		scan.close();
		
	}
}
