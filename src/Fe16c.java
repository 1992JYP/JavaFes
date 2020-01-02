import java.util.Random;

public class Fe16c {
	//로또뽑기 1~45
	public static void main(String[] args) {
		
		Random lotto=new Random();
		
		
		for (int i=0;i<6;i++) {
			System.out.println(i+1+"번째 숫자 : "+(lotto.nextInt(45)+1));
		}
	}
}
