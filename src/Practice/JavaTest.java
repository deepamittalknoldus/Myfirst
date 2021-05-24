package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class MyList implements Runnable
{
//	T value;

	/*
	 * public MyList (String str) 
	 * { 
	 * 		MyList m = new MyList("deepa"); 
	 * }
	 */
	
	List l = new ArrayList<Integer>();
	LinkedHashMap <String, Integer> map = new LinkedHashMap<String, Integer>();
	
	
	public int show (Object a)
	{
		System.out.println("checking overriding");
		return 0;
	}
	
	public int show (String s)
	{
		System.out.println("Second wala called");
		return 1;
	}
	public int show (String s, int i)
	{
		System.out.println("third one");
		return 0;
	}
	
	List <Number> list = new LinkedList<Number>();
	 int arr [] = new int [5];


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * public T getValue() { return value; }
	 * 
	 * public void setValue(T value) { this.value = value; }
	 * 
	 */
}

class Super {
    public int index = 1;
}

class JavaTest extends Super {

	/*
	 * public JavaTest(int index) { this.index = index; }
	 */
    public static void main(String args[]) {
    //	JavaTest myApp = new JavaTest(10);
    	
      //  System.out.println(myApp.index);
    	
    	FunctionalInterface fi = new FunAppClass();
    	FunctionalInterface.show();
    	
    	
    	
		/*
		 * MyList ml = new MyList(); ml.show(null);
		 * 
		 * List <String> l = new ArrayList <String>();
		 * 
		 * Integer i = new Integer (4);
		 * 
		 * String s = "Deepa";
		 */
    }
}


