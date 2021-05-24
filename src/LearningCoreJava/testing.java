package LearningCoreJava;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

class A
{
	int show()
	{
		System.out.println("in class A");
		return 1;
	}
	double show(int i)
	{ 
		return 0;
	}
}
class B extends A
{
	int show()
	{
		System.out.println("in class b");
		return 2;
	}
}

public class testing {

	public static void main(String[] args) 
	
	{
		A a = new B();
		a.show();
		
		AtomicInteger AI = new AtomicInteger();
		System.out.println("value coming here  is"+ AI.decrementAndGet());
		
		System.out.println("value coming here  is"+ AI.incrementAndGet());
		
		String st = "Deepa";
		
		ConcurrentHashMap<String,Integer> chashmap = new ConcurrentHashMap<String, Integer>();
		/*
		 * A.show(); 
		 * B.show();
		 */
		
		
		// TODO Auto-generated method stub
		
		/*
		 * for (int i = 0; i < 3; i++) { System.out.print(args + " "); }
		 */
		
		/*
		 * boolean t =testing.matches("aaaaJAVA"); 
		 * System.out.println("result is"+t);
		 */
		
	}
	
	public static boolean matches(String str){
		  Pattern p = Pattern.compile("[01]*aJAVA");
		  java.util.regex.Matcher m = p.matcher(str);
		  return m.matches();
		}
	

}
