class ArrayCreateDemo{
	
	public static void main(String[] args){
	//Approach-1
	
	String[] fnames=new String[3];
	fnames[0]="PVSindhu";
	fnames[1]="Deepikapadukone";
	fnames[2]="Anushka";
	
	System.out.println("Length is:: " +fnames.length);
	System.out.println(fnames[0]);
	System.out.println(fnames[1]);
	System.out.println(fnames[2]);
	System.out.println("  ");
	
	//Approach-2
	
	String[] names={"Sachin","Ganguly","Virat"};
	
	System.out.println("Names length :: " +names.length);
	System.out.println(names[0]);
	System.out.println(names[1]);
	System.out.println(names[2]);
	
	}
}