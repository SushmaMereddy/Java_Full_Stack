import java.lang.String;

public class CommandLineArguments{
	
	public static void main(String[] abc){
		
		int x=Integer.parseInt(abc[0]);
		int y=Integer.parseInt(abc[1]);
		int z=x+y;
		System.out.println(z);
		
	}
}