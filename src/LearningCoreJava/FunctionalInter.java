package LearningCoreJava;


@FunctionalInterface
public interface FunctionalInter 
{
	boolean equals (Object o);
	void check2();

	
	
	 default void check()
	{
        System.out.println("in class");
	}
	
}
