import java.util.Random;

public class Fe16c {
	//�ζǻ̱� 1~45
	public static void main(String[] args) {
		
		Random lotto=new Random();
		
		
		for (int i=0;i<6;i++) {
			System.out.println(i+1+"��° ���� : "+(lotto.nextInt(45)+1));
		}
	}
}
