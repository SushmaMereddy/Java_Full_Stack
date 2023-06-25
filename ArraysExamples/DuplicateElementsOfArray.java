import java.util.Arrays;
class DuplicateElementsOfArray{
	public static void main(String[] args){
		int[] a={4,2,6,2,1,3,9,4,5,9};
		System.out.println("Original Array: "+Arrays.toString(a));
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}