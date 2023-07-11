public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println("Hash Code for: "+sb+" "+sb.hashCode());
		System.out.println(sb.length());
		
		System.out.println(sb.append("Java"));
		System.out.println(sb.append(1.7));
		System.out.println(sb.append("Program"));
		System.out.println("Hash Code for: "+sb+ " "+sb.hashCode());
		
		System.out.println("\n"+sb.deleteCharAt(5));
		System.out.println(sb.delete(6, 8));
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Java Practice");
		System.out.println("\n"+sb1);
		System.out.println(sb1.substring(5));
		System.out.println(sb1.substring(2, 8));
		
		System.out.println("\n"+sb1);
		System.out.println(sb1.insert(0,"Jdk"));
		System.out.println(sb1.insert(4, 1.7));
		
		StringBuffer sb2=new StringBuffer("Java1.8Version");
		System.out.println("\n"+sb2.replace(0,7 ,"Jse"));
		
		System.out.println(sb2.reverse());
		
		StringBuilder sb3=new StringBuilder("Java Program");
		System.out.println("\nHash Code for: "+sb3+" "+sb3.hashCode());
		sb3=sb3.append("Practice");
		System.out.println("Hash Code for: "+sb3+" " +sb3.hashCode());
		
	}

}