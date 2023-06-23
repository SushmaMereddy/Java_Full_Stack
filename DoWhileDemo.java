class DoWhileDemo{
	public static void main(String[] args){
		int n=11;
		int j=11;
		while(j<=10){
			System.out.println("While :: "+"2*"+j+"=" +j*2);
			j++;
		}
		
		System.out.println( "===== =====");
		
		do{
			System.out.println("Do-While :: " + "3*" +n+ "=" +n*3);
			n++;
		}while(n<=10);
	}
}