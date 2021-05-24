package LearningCoreJava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SingltonClass
{
	private static SingltonClass singleInstance;
	
	private SingltonClass()
	{
		
	}
	
	private static synchronized SingltonClass getInstance ()
	{
		if (singleInstance == null)
		{
			synchronized (SingltonClass.class) 
			{
				System.out.println("are we coming here");
				singleInstance = new SingltonClass();
			}
		}
		return singleInstance;
	}

	public static void main(String[] args) 
	{
		//SingltonClass s1 = new SingltonClass();
		//SingltonClass s2 = new SingltonClass();
		
		Map<String, String> hasmap = Collections.synchronizedMap(new HashMap<String, String>());
		
		hasmap.put("1", "Deepa");
		hasmap.put("2", "Gaurav");
		hasmap.put("3", "gaurdeepa");
		hasmap.put("4", "deepagaur");
		
		for (String key:hasmap.keySet())
		{
			
			System.out.println("value is" + hasmap.get(key));
			hasmap.put("5", "dg");
			
		}
		
		
		/*
		 * SingltonClass s1 = SingltonClass.getInstance();
		 * 
		 * SingltonClass s2 = SingltonClass.getInstance();
		 * 
		 * singleInstance = new SingltonClass();
		 * 
		 * SingltonClass newinsta = new SingltonClass();
		 * 
		 * System.out.println("code is "+s1.hashCode()+" second code is"+s2.hashCode()
		 * +"another code is "+singleInstance.hashCode() + "another code is" +
		 * newinsta.hashCode());
		 */
	}

}

