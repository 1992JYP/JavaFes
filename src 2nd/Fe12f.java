import java.util.Arrays;

public class Fe12f {
	public static void main(String[] args) {
//		
//		������ �ο��� �̱�
//		���ھ� ���ڿ��� char�迭�� ����
//		char�迭�� ,�� ���ϱ�
//		if������ A,B,C,D,F �� ������ �����ָ� ��
//		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] scorearray=score.split(",");
		char[] grade= {'A','B','C','D','F'};
		int[] count= {0,0,0,0,0};
		
		System.out.println(Arrays.toString(scorearray));
		
		for(int i=0;i<scorearray.length;i++) {
			if(scorearray[i].equals("A")) {
				count[0]=count[0]+1;
			}
			else if(scorearray[i].equals("B")) {
				count[1]++;
			}
			else if(scorearray[i].equals("C")) {
				count[2]++;
			}
			else if(scorearray[i].equals("D")) {
				count[3]++;
			}
			else if(scorearray[i].equals("F")) {
				count[4]++;
			}			
			
		}
		
		for (int i=0; i<count.length;i++) {
			System.out.println(grade[i]+" : "+count[i]+"��");
		}
		
		
		
	}
}
