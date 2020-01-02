import java.util.Scanner;

public class Fe31f {
	
	public static String ceaser(String pw, int pwn) {
		String passed =""; 
		char[] pwlist=pw.toCharArray();
		
		for (int i = 0; i < pwlist.length; i++) {
			int anspw=pwlist[i] + pwn;
			if ('A' <= pwlist[i] && pwlist[i] <= 'Z') {
				if ('A' <= anspw && anspw <= 'Z')
					passed=passed+(char)anspw;
				else {
					while(!('A' <= anspw && anspw <= 'Z')) {
						anspw=(char)(anspw-26);
					}
					passed=passed+((char)anspw);
				}
			}

			else if ('a' <= pwlist[i] && pwlist[i] <= 'z') {
				if ('a' <= anspw && anspw <= 'z')
					passed=passed+((char) (anspw));
				else {
					while(!('a' <= anspw && anspw <= 'z')) {
						anspw=(char)(anspw-26);
					}
					passed=passed+((char) (anspw));
				}
			} else {
				passed=passed+(pwlist[i]);
			}

		}
		
		return passed;
	}
	
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
		int pwn;

		System.out.println("���� �Է�");
		sol = scan.nextLine();//���ڿ� �Է¹����� ���������� �̰� ��Ȯ��
		System.out.println("ĭ �� �Է�");
		pwn = scan.nextInt();

		
//		for (int i = 0; i < pw.length; i++) { // �迭 Ȯ�ο�
//			System.out.println(pw[i] + "*");
//		}
		
		System.out.println(ceaser(sol,pwn));
		

		scan.close();

	}
}
