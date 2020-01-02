
public class Fe08c {
	
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
		
		
		System.out.println("±è¾¾´Â "+findKim(name)+"¿¡ ÀÖ´Ù.");
		
	}
}
