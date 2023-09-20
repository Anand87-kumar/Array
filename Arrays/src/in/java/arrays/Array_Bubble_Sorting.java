package in.java.arrays;

public class Array_Bubble_Sorting {

	public static void main(String[] args) {
		int temp;
		int[] a= {36,19,29,12,5};
		int flag=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
				
			}
			if(flag==0) {
				break;
			}
			for(int i1=0;i1<a.length;i1++) {
				System.out.print(a[i1]+" ");
			}
		}

	}

}
