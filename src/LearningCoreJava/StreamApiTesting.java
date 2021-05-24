package LearningCoreJava;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiTesting {

public static void main(String[] args)
{

	List<Integer> myList = Arrays.asList(34,53,12,50,45,21);
	
	List<String> myList1 = Arrays.asList("Deepa","gaurav","neha","meetu");
	
	LocalDate localDate = LocalDate.now();
	
	System.out.println("date is"+localDate);
	
	LocalTime now = LocalTime.now();
	
	System.out.println("local time now"+now);
	
	LocalTime sixThirty = LocalTime.parse("06:30");
	
	System.out.println("it is "+sixThirty);

	Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
	
	for (String s : allZoneIds)
	{
		System.out.println(s);
	}
	
	ZoneId zoneId = ZoneId.of("Europe/Paris");
	
	System.out.println("zone id is "+zoneId);
	
	
	int sum= myList.stream().mapToInt(Integer::intValue).sum();
	System.out.println("sum is"+sum);
	
	List<String> copy1 = myList1.stream()
			  .filter(s -> s.length() > 5)
			
			  .collect(Collectors.toList());
			
		/*
		 * copy1.forEach(System.out::println); 
		 * copy.forEach(System.out::println);
		 */
	
	List<String> copy2 = myList1.stream()
			  .collect(Collectors.toList());
	copy2.forEach(System.out::println);
		/*
		 * System.out.println(myList.stream().filter(i->i%5==0) .map(i -> i*2)
		 * .findFirst() .orElse(0));
		 * 
		 * Optional<String> op = Optional.empty();
		 */

}

}
