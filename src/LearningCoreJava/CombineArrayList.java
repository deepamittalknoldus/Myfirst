package LearningCoreJava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class CombineArrayList implements FunctionalInter,SecondFunctionalInter{

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(34,53,12,50,45,21);
		
		System.out.println(myList.stream().filter(i->i%5==0)
										  .map(i -> i*2)
										  .findFirst()
										  .orElse(0));
		
		Optional<String> op = Optional.empty();
		
		int arr1 []= {1,2,3,4};
		int arr2 [] = {7,8,9,5,6,8,34};
		
		int length1 = arr1.length;
		int length2 = arr2.length;
		
		int arr3 [] = new int[length1+length2];
		
		
		if (length1<length2)
		{
			for (int i= 0 ,j=0;i<length2;i++)
			{
				if (i<length1)
				{
					arr3[j] = arr1 [i];
					arr3[j+1] = arr2 [i];
					j= j+2;
				}
				else
				{
					
					arr3[j] = arr2[i];
					j++;
				}
			}
		}
		else
		{
			for (int i= 0 ,j=0;i<length1;i++)
			{
				if (i<length2)
				{
					arr3[j] = arr1[i];
					arr3[j+1] = arr2[i];
					j= j+2;
				}
				else
				{
					arr3[j] = arr1[i];
					j++;
				}
			}
		}
		
		for (int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]+" ");
		}

	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		FunctionalInter.super.check();
	}

	@Override
	public void check2() {
		// TODO Auto-generated method stub
		
	}

}
