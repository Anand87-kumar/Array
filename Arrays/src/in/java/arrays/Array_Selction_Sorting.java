package in.java.arrays;

public class Array_Selction_Sorting {

	public static void main(String[] args) {
		int min = 0;
		int temp;
		int[] a= {38,52,9,18,6,62,13};
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=0;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
					
				}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
			for(int i1=0;i1<a.length;i1++) {
				System.out.print(a[i1]+",");
			}
		}

	}

}
