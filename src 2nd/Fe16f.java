import java.util.Random;

public class Fe16f {
	// 로또뽑기 1~45
	public static void main(String[] args) {

		Random lotto = new Random();

		int[] lottonum = new int[6];
		for (int i = 0; i < 6; i++) {// 출력할때마다 랜덤
			lottonum[i] = (lotto.nextInt(6) + 1);
//			System.out.println(i + 1 + "번째 숫자 : " + lottonum[i]);
			for (int j = 0; j < i; j++) {
				if (lottonum[j] == lottonum[i]) {
					lottonum[i] = (lotto.nextInt(6) + 1);
					i--;
				}
			}
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(i + 1 + "번째 숫자 : " + lottonum[i]);

		}
	}
}
