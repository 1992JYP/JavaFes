
public class Fe25c {
	public static void main(String[] args) {
		
//		�ּҰŸ� �� 2�� �ε��� �̱�
		
		int[] point = {92,32,52,9,81,2,68};
		
		int minI1=0;
		int minI2=0;
		int minL=999;
		int len=0;
		
		
		for (int i=0;i<point.length;i++) {
			for (int l=i+1;l<point.length;l++) {
				len=point[i]-point[l];
				if (len<0) {
					len=len*-1;
				}
				if (minL>len) {
					minL=len;
					minI1=i;
					minI2=l;
				}
			}
		}
		
		System.out.println("�ּҰŸ� index : " + minI1 +" "+ minI2);
		
	}
}
