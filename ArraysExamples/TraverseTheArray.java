import java.util.stream.Stream;
class TraverseTheArray{
	public static void main(String[] args){
		String[] names ={"Sachin" , "Ganguly" ,"Sehwag"};
		
		System.out.println("===Approach-1===Using for loop");
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
		System.out.println("===Approach-2===Using forEach loop");
		for(String name:names){
			System.out.println(name);
		}
		
		System.out.println("Approach-3===using Streams");
		Stream.of(names).forEach(name->System.out.println(name));
		
		System.out.println("====Reverse Order===");
		for(int i=names.length-1;i>=0;i--){
			System.out.println(names[i]);
		}
	}
	
}