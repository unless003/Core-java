
public class b22 {
	static void  pairs_value(int inputArray[], int inputNumber)
	  {
	
		for (int i =  0; i < inputArray.length; i++)
		  {
		  for (int j  = i+1; j < inputArray.length; j++)
		  {
		  if(inputArray[i]+inputArray[j] == inputNumber)
		  {
		  System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
		  }
		  }
		  }
		  }
		  
		  public static void  main(String[] args)
		  {
		  pairs_value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);
		  
		  pairs_value(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);
		  
		  }

	}

