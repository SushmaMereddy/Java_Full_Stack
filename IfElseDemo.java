class IfElseDemo{
	
	public static void main(String[] args){
		
		int age=21;
		if(age>18){
			System.out.println("Adult eligible to caste your vote");
		}else{
			int res =18-age;
			System.out.println("Child will not eligible to caste your vote...wait for "+res+" more years");
		}
	}
}