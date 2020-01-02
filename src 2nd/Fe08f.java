
public class Fe08f {
//	김서방 찾기
//	스트링 배열에서 인덱스와 .equals를 활용해서 
//	원하는 스트링 찾기
	public static int findKim(String[] name) {
		
		int pos=0;
		
		for(int i=0;i<name.length;i++) {
			if(name[i].equals("Kim")) {
				pos=i+1;
			}
		}
		
		return pos;
	}
	
	public static void main(String[] args) {
		
		String[] name = {"ABC","DEF","Kim"};
		
		
		System.out.println("김씨는 "+findKim(name)+"에 있다.");
		
	}
}
