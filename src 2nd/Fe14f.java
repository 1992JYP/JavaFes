import java.util.Scanner;

public class Fe14f {
	public static String middle(String str) {
		
//		��� ���� ���
//		���� ��Ʈ���� char�迭�� ����
//		Ȧ���� ������ 2�ϸ� �װ� ��� ���� ��ġ�� �ε���
//		¦���� ������ 2�ؼ� �װ� ���+1 ���� ��ġ��
//		��� -1������ġ�� �̾��ָ� ��
		
		
		char[] getmid=str.toCharArray();
		
		String midded="";
		
		if(getmid.length%2==0) {
			midded=midded+getmid[getmid.length/2-1]+getmid[getmid.length/2];
		}
		
		else {
			midded=midded+getmid[getmid.length/2];
		}
		
		return midded;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String getStr="";
		
		System.out.println("��� ���� ��� ");
		getStr=scan.next();
		System.out.println(middle(getStr));
		
		
		scan.close();
		
	}
}
