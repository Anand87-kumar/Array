package in.java.arrays;
//time complexity is T(n)=2T(n/2)+n) is compared to bubble sort,selection sort,and insertion sort.

public class Array_Merge_Sorting {
	int[] array;
	int[] tempMergeArr;
	int length;
	public static void main(String[] args) {
		
		int[] inputArr= {48,36,13,52,19,21,94};
		
		
	}
	public void sort(int inputArr[]) {
		this.array=inputArr;
		this.length=inputArr.length;
		this.tempMergeArr=new int[length];
		divideArray(0,length-1);
		
	}
	public void divideArray(int lowerIndex,int higherIndex) {
		if(lowerIndex<higherIndex) {
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
		}
	}

}
