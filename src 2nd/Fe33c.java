
public class Fe33c {
	public static void main(String[] args) {
		
//		ABC �𷡽ð�
		
		char n='A';
		int temp=0;
		for (int l=1;l<=3;l++) {//�� �ﰢ�� ���� ���
			for (int b=1; b<=l-1;b++) {
				System.out.print("  ");
			}
			for (int c=5; c>=l*2-1;c--) {
				System.out.print((char)(n+temp)+" ");
				temp+=1;
			}
			System.out.println();
		}
		
		
		for (int l=1;l<=2;l++) {//�Ʒ� �ﰢ�� ���
			for (int b=1; b>=l;b--) {
				System.out.print("  ");
			}
			for (int c=1; c<=l*2+1;c++) {
				System.out.print((char)(n+temp)+" ");
				temp+=1;
			}
			System.out.println();
		}
	}
}
