import java.util.Scanner;

public class Fe14f {
	public static String middle(String str) {
		
//		가운데 글자 얻기
//		받은 스트링을 char배열로 만듬
//		홀수면 나누기 2하면 그게 가운데 글자 위치의 인덱스
//		짝수면 나누기 2해서 그게 가운데+1 글자 위치임
//		가운데 -1글자위치도 뽑아주면 됨
		
		
		char[] getmid=str.toCharArray();
		
		String midded="";
		
		if(getmid.length%2==0) {
			midded=midded+getmid[getmid.length/2-1]+getmid[getmid.length/2];
		}
		
		else {
			midded=midded+getmid[getmid.length/2];
		}
		
		return midded;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String getStr="";
		
		System.out.println("가운데 글자 얻기 ");
		getStr=scan.next();
		System.out.println(middle(getStr));
		
		
		scan.close();
		
	}
}
