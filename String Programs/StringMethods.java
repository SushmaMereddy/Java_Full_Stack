public class StringMethods {

	public static void main(String[] args) {
		String str= new String("Java Program");
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		//System.out.println(str.charAt(13));
		System.out.println("Before Concatinate: "+str);
		String str1=new String("Practice");
		str=str.concat(str1);
		System.out.println("After Concatination: " +str);
		
		String s1=new String("abc");
		String s2=new String("bcd");
		System.out.println("HashCode for :: s1 " +s1   +s1.hashCode());
		System.out.println("HashCode for :: s2 " +s2  +s2.hashCode());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3=new String("hello");
		String s4=new String("hello");
		String s5="hello";
		String s6="hello";
		System.out.println("\n"+s3.equals(s4));
		System.out.println(s5==s6);
		System.out.println(s3+1+2+3);
		System.out.println(s3+1+(2+3));
		
		System.out.println("\n" +str);
		System.out.println(str.startsWith("Ja"));
		System.out.println(str.endsWith("Program"));
		System.out.println(str.endsWith("Practice"));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('r'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf('r'));
		System.out.println(str.replace('J','W'));
		System.out.println(str.replaceAll("Program", "Develop"));
		System.out.println(str.substring(5));
		System.out.println(str.substring(8, 10));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str+"b ye");
		System.out.println(str.trim()+"bye");
		
		String a1=new String("hello");
		String a2=a1.intern();
		System.out.println(a1);
		System.out.println(a2);
		
		

	}

}
