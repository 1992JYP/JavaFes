
public class Fe27c {

//	�պ�&����

	public static int[] merge(int[] list1, int[] list2) {

		int[] merged = new int[list1.length + list2.length];

		for (int i = 0; i < list1.length; i++) {
			for (int s = i + 1; s < list1.length; s++) {
				if (list1[i] > list1[s]) {
					list1[i] = list1[i] + list1[s];
					list1[s] = list1[i] - list1[s];
					list1[i] = list1[i] - list1[s];
				}
			}
		}
		for (int i = 0; i < list2.length; i++) {

			for (int s = i + 1; s < list2.length; s++) {
				if (list2[i] > list2[s]) {
					list2[i] = list2[i] + list2[s];
					list2[s] = list2[i] - list2[s];
					list2[i] = list2[i] - list2[s];
				}
			}
		}
		int mergeArr = 0;
		int a=0;
		int b=0;
		
		for (; a <list1.length;) {
			for (; b <list2.length;) {
				if (list1[a] > list2[b]) {
					System.out.println("1�� ��ŭ"+ list2[b]+"��");
					merged[mergeArr] = list2[b];
					b++;
					mergeArr++;
					break;
				}
				else {
					System.out.println("2�� ��ŭ"+list1[a]+"��");
					merged[mergeArr] = list1[a];
					a++;
					mergeArr++;
					break;
					
				}
			}
			if(list1.length==a) {
				System.out.println("1����");
				for (int f=b;f<list2.length;f++) {
					System.out.println(list2[f]+"����"+mergeArr+"�� ����");
					merged[mergeArr]=list2[f];
					mergeArr++;
				}
			}
			else if(list2.length==b) {
				System.out.println("2����");
				for (int f=a;a<list1.length;f++) {
					merged[mergeArr]=list1[f];
					mergeArr++;
				}
				break;
			}
			
		}
		System.out.println(merged.length);
		for (int i=0 ;i<merged.length;i++)
			System.out.println(merged[i]);

		return merged;
	}

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,10};
		
		int[] merged=new int[merge(a,b).length];
		merged=merge(a,b);
		System.out.println("====�պ����� ���====");
		for(int i=0; i<merged.length;i++) {
			System.out.print(merged[i]+" ");
		}
	}
}
