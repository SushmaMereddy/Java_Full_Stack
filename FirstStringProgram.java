package StringExamplesPractice;

public class FirstStringProgram {
	public static void main(String[] args) {
	
	System.out.println("=====String Concept=====");
	String msg="Hello";
	System.out.println("Hashcode for :: " +msg + " :: " +msg.hashCode());
	msg="string";
	System.out.println("Hashcode for :: " +msg+ " :: " +msg.hashCode());
	msg=msg.concat(" Immutable");
	System.out.println("Hashcode for :: " +msg+ " :: "+msg.hashCode());
	
	System.out.println("====== String Buffer =====");
	StringBuffer sb=new StringBuffer("string");
	System.out.println("Hashcode for :: " +sb+ " :: " +sb.hashCode());
	sb.append(" Mutable");
	System.out.println("Hashcode for :: " +sb+ " :: " +sb.hashCode());
	
	System.out.println("=====String Builder =====");
	StringBuilder sb1=new StringBuilder("string");
	System.out.println("Hashcode for :: " +sb1+ " :: " +sb1.hashCode());
	sb1.append(" Mutable");
	System.out.println("Hashcode for :: " +sb1+ " :: " +sb1.hashCode());
	
}
}
