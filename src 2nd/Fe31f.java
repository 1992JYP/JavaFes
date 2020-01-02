import java.util.Scanner;

public class Fe31f {
	
	public static String ceaser(String pw, int pwn) {
		String passed =""; 
		char[] pwlist=pw.toCharArray();
		
		for (int i = 0; i < pwlist.length; i++) {
			int anspw=pwlist[i] + pwn;
			if ('A' <= pwlist[i] && pwlist[i] <= 'Z') {
				if ('A' <= anspw && anspw <= 'Z')
					passed=passed+(char)anspw;
				else {
					while(!('A' <= anspw && anspw <= 'Z')) {
						anspw=(char)(anspw-26);
					}
					passed=passed+((char)anspw);
				}
			}

			else if ('a' <= pwlist[i] && pwlist[i] <= 'z') {
				if ('a' <= anspw && anspw <= 'z')
					passed=passed+((char) (anspw));
				else {
					while(!('a' <= anspw && anspw <= 'z')) {
						anspw=(char)(anspw-26);
					}
					passed=passed+((char) (anspw));
				}
			} else {
				passed=passed+(pwlist[i]);
			}

		}
		
		return passed;
	}
	
	public static void main(String[] args) {

//		caeser 암호만들기 
//		아스키코드 이해 필요
//		아스키 A 가 몇인지 모름
//		애초에 이걸 알아야 한다는거 자체가 의문임
//		알파벳이 26개
//		대문자 Z다음이 소문자 a 인것 까지는 알고 있다.
//		원하는건 대문자Z에서 한칸 증가시키면 소문자 a가 나오니까
//		대문자가 소문자가 되면 -26을 해주고  아스키코드를 15라고 치면
//		소문자가 다른문자가 되면 -26을 해주고 
//		보다 26으로 나눈 나머지가 같네??\
//		A아스키코드가 대충 15라고 치면
//		a아스키코드는 41일거임
//		확인해봄 아니네.. 젠장
//		잘못알고있었네

//		다시 시작해보자
//		그럼 결국 위치제한 뿐이네 잠깐만
//		'a'+'a'-'a'='a'니까
//		a부터 z까지 26으로 나눈 나머지가 연속임
//		'a'가 65고 'z'가 90이니까
//		a%26+a=.... 모르겠다.. 범위제한 하자...
//		
//		내일하자....

		Scanner scan = new Scanner(System.in);

		String sol;
		int pwn;

		System.out.println("원문 입력");
		sol = scan.nextLine();//문자열 입력받을때 공백있으면 이게 정확함
		System.out.println("칸 수 입력");
		pwn = scan.nextInt();

		
//		for (int i = 0; i < pw.length; i++) { // 배열 확인용
//			System.out.println(pw[i] + "*");
//		}
		
		System.out.println(ceaser(sol,pwn));
		

		scan.close();

	}
}
