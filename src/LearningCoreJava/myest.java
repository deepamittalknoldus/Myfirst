package LearningCoreJava;

public class myest {
	

	public  synchronized void methodA(int i,String mesg)
	{
		System.out.println(Integer.toString(i));
		System.out.println(mesg);
	}
	public  synchronized void methodB(int i,String mesg)
	{
		synchronized (this) {
			System.out.println(Integer.toString(i));
			System.out.println(mesg);
		}
	}
	final int count=10;
	 
	/*
	 * public void setCount() 
	 * { count=20; }
	 */
	
	static final int myvar ;
	static
	{
		myvar = 10;
		
	}
	public static void main(String args[])
	{
		myest my = new myest();
		System.out.println( "value is" + myest.myvar);
		
		
    // my.methodA(1, "Deepa");
		
	//	my.methodB(1, "Deepa");
		
		
		/*
		 * String s = "this"; System.out.println("oh my god, i never thought of this   "
		 * + s.charAt(-1));
		 * 
		 * 
		 * String s1= "abc"; String s2 = new String ("abc");
		 * 
		 * if (s1==s2) { System.out.println("these are equals"); } else {
		 * System.out.println("not equals"); }
		 */
		
		
		
		
	}
}
