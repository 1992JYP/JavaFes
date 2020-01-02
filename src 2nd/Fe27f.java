
public class Fe27f {

//	합병&정렬
//	난 정렬 후 합병할때 정렬하면서 합병함
//	선택정렬씀

	public static int[] merge(int[] list1, int[] list2) {

		int[] merged = new int[list1.length + list2.length];

		for (int i = 0; i < list1.length-1; i++) {
			int max = list1[i];
			int ind = i;
			int temp=0;
			
			for (int s = i + 1; s < list1.length; s++) {
				if (max > list1[s]) {
					max = list1[s];
					ind = s;
				}
			}

			temp = list1[i];
			list1[i] = list1[ind];
			list1[ind] = temp;
		}
		for (int i = 0; i < list2.length-1; i++) {
			int max = list2[i];
			int ind = i;
			int temp=0;
			
			for (int s = i + 1; s < list2.length; s++) {
				if (max > list2[s]) {
					max = list2[s];
					ind = s;
				}
			}

			temp = list2[i];
			list2[i] = list2[ind];
			list2[ind] = temp;
		}
		int mergeArr = 0;
		int a=0;
		int b=0;
		
		for (; a <list1.length;) {
			for (; b <list2.length;) {
				if (list1[a] > list2[b]) {
					System.out.println("1이 더큼"+ list2[b]+"들어감");
					merged[mergeArr] = list2[b];
					b++;
					mergeArr++;
					break;
				}
				else {
					System.out.println("2가 더큼"+list1[a]+"들어감");
					merged[mergeArr] = list1[a];
					a++;
					mergeArr++;
					break;
					
				}
			}
			if(list1.length==a) {
				System.out.println("1끝남");
				for (int f=b;f<list2.length;f++) {
					System.out.println(list2[f]+"들어간다"+mergeArr+"로 간다");
					merged[mergeArr]=list2[f];
					mergeArr++;
				}
			}
			else if(list2.length==b) {
				System.out.println("2끝남");
				for (int f=a;a<list1.length;f++) {
					merged[mergeArr]=list1[f];
					mergeArr++;
				}
				break;
			}
			
		}
		for (int i=0 ;i<merged.length;i++)
			System.out.println(merged[i]);

		return merged;
	}

	public static void main(String[] args) {
		int[] a= {1,3,5,7,9};
		int[] b= {6,7,8,9,8};
		
		int[] merged=new int[merge(a,b).length];
		merged=merge(a,b);
		System.out.println("====합병정렬 결과====");
		for(int i=0; i<merged.length;i++) {
			System.out.print(merged[i]+" ");
		}
	}
}
