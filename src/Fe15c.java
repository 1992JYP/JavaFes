
public class Fe15c {
	
//	�Ǻ���ġ ���� : 
	
	
	public static int Fibo(int num) {

		
		if (num == 1||num==0) {
			return 1;
		} else if (num == 2) {
			return 2;
		} else {
			return Fibo(num - 1) + Fibo(num - 2);
		}
	}
	
	
	public static void main(String[] args) {
		
		int input=10;
		System.out.println("�Ǻ���ġ");
		for(int i=0;i<input;i++) {
			System.out.print(Fibo(i) +" ");
		}
		
		
	}
}
