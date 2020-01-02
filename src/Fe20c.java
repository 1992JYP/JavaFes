
public class Fe20c {

	//재귀 안배워서 설명하기 힘들겠다..
	
	
	public static int collatz(int num) {

		int count = 0;
		if (num > 2) {
			if (num % 2 == 0) {

				count = count + collatz(num / 2);
			} else
				count = count + collatz(num * 3 + 1);
		}
		if (count == 500) {
			return -1;
		}

		return count + 1;

	}

	public static void main(String[] args) {

		System.out.println(collatz(16));
	}
}
