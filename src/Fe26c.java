import java.util.Scanner;

public class Fe26c {

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

		for (int i = 0; i < list.length; i++) {
			
			for (int s =i+1; s<list.length; s++) {
				if(list[i]>list[s]) {
					list[i]=list[i]+list[s];
					list[s]=list[i]-list[s];
					list[i]=list[i]-list[s];
				}
			}
			
		}
		System.out.print("선택정렬 결과 : ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
		
		scan.close();

	}

}
