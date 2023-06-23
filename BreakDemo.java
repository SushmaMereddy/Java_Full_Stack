class BreakDemo{
	public static void main(String[] args){
		int sum=0;
		int capacity=5;
		for(int i=0;i<=10;i++){
			System.out.println(i);
			sum=sum+i;
			if(sum>=capacity){
				System.out.println(sum);
				break;
			}
			
		}
	}
}