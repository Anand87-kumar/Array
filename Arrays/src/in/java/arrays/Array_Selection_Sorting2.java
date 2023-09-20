package in.java.arrays;

public class Array_Selection_Sorting2 {

	public static void main(String[] args) {
		
		String[] str= {"anand","rahul","ramesh","bhuppi","amit"};
		
		int min;
		String temp;
		for(int i=0; i<str.length;i++) {
			min=i;
			for(int j=0;j<str.length;j++) {
				if(str[j].compareTo(str[min])>0) {
					min=j;
				}
				temp=str[i];
				str[i]=str[min];
				str[min]=temp;
			}
			for(int i1=0;i1<str.length;i1++) {
				System.out.print(str[i1]+",");
			}
		}

	}

}
