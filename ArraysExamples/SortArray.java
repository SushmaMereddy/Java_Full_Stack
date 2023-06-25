import java.util.Arrays;
class SortArray{
	
	public static void main(String[] args){
		
		int[] a={4,2,3};
		System.out.println("Original array: " +Arrays.toString(a));
				 
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
				int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			 }
		}
		
		//Arrays.sort(a);
				
		System.out.println("Sorted Array: " + Arrays.toString(a));
	}
}