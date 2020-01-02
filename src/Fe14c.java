import java.util.Scanner;

public class Fe14c {
	public static String middle(String str) {
		
//		가운데 글자 얻기
		
		
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
