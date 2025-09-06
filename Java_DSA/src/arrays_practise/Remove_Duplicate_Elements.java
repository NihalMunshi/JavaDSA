package arrays_practise;

import java.util.LinkedHashSet;

public class Remove_Duplicate_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Duplicate_Elements remove =new Remove_Duplicate_Elements();
		remove.remove_duplicate();

	}
	
	public void remove_duplicate()
	{
		//int temp=0;
		int[] arr={2,3,4,6,6,9,8,12,45,8,9,12,18,60};
		LinkedHashSet< Integer> set = new LinkedHashSet<>();
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			set.add(arr[i]);
			
		}
		System.out.println(" "+set);
		
	}

}
