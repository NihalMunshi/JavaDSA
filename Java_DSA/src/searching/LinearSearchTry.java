package searching;

public class LinearSearchTry {

	public static void main(String[] args) {
		
		LinearSearchTry linear = new LinearSearchTry();
		linear.Linear_search_try_1(100);
		
				
	}
	
	public void Linear_search_try_1(int num)
	{
		int arr[] = {5,12,42,6,9,7,45,18,10,14}; 
		int array_size= arr.length;	
		boolean found=false;
		
		for(int i=0;i<array_size;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("Element found in Array at index "+i);
				found=true;
				break;
			}
		}
		if(!found)
			System.out.println("Element not found");

		
	}

}
