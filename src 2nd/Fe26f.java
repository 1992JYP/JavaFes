import java.util.Arrays;
import java.util.Scanner;

public class Fe26f {

	public static void main(String[] args) {

//		오름차순 선택정렬
//		선택 정렬 : 첫번째 값을 두번째부터 끝까지 비교한 후 최소값(혹은 최대값)의 위치를 확인 후 교체
//		
		Scanner scan = new Scanner(System.in);
		int[] list = new int[5];

		for (int i = 0; i < list.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			list[i] = scan.nextInt();
		}

		for (int i = 0; i < list.length-1; i++) {
			System.out.println(i + 1 + " step");
			int max = list[i];
			int ind = i;
			int temp=0;
			for (int s = i + 1; s < list.length; s++) {
				if (max > list[s]) {
					max = list[s];
					ind = s;
				}
			}

			temp = list[i];
			list[i] = list[ind];
			list[ind] = temp;
			System.out.println(Arrays.toString(list));
		}
		
		
		System.out.print("선택정렬 결과 : ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
		
		scan.close();

	}

}
