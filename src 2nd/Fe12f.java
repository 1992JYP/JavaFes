import java.util.Arrays;

public class Fe12f {
	public static void main(String[] args) {
//		
//		학점별 인원수 뽑기
//		스코어 문자열을 char배열로 나눠
//		char배열에 ,도 들어가니까
//		if문에서 A,B,C,D,F 다 조건을 적어주면 됨
//		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] scorearray=score.split(",");
		char[] grade= {'A','B','C','D','F'};
		int[] count= {0,0,0,0,0};
		
		System.out.println(Arrays.toString(scorearray));
		
		for(int i=0;i<scorearray.length;i++) {
			if(scorearray[i].equals("A")) {
				count[0]=count[0]+1;
			}
			else if(scorearray[i].equals("B")) {
				count[1]++;
			}
			else if(scorearray[i].equals("C")) {
				count[2]++;
			}
			else if(scorearray[i].equals("D")) {
				count[3]++;
			}
			else if(scorearray[i].equals("F")) {
				count[4]++;
			}			
			
		}
		
		for (int i=0; i<count.length;i++) {
			System.out.println(grade[i]+" : "+count[i]+"명");
		}
		
		
		
	}
}
