import java.util.Random;

public class Fe16f {
	//�ζǻ̱� 1~45
	public static void main(String[] args) {
		
		Random lotto=new Random();
		
		int[] lottonum=new int[6];
		for (int i=0;i<6;i++) {//����Ҷ����� ����
			lottonum[i]=(lotto.nextInt(45)+1);
			for (int j=0;j<i;j++) {
				if(lottonum[j]==lottonum[i]) {
					while(lottonum[j]==lottonum[i]) {
						lottonum[i]=(lotto.nextInt(45)+1);
					}
				}
			}
			System.out.println(i+1+"��° ���� : "+(lotto.nextInt(45)+1));
		}
	}
}
