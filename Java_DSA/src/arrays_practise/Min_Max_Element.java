package arrays_practise;

import java.util.Arrays;

public class Min_Max_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Min_Max_Element.min_max();

	}
	public static void min_max()
	{
		int[] arr = {2,40000,3,4,6,6,9,8,12,10,15,12,1,45,100,20000,18};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i] =arr[j];
					arr[j]=temp;
					
				}
			}	
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(" Minimumm element  of array is "+arr[0]);
		System.out.println(" Maximum element aof array  is "+arr[arr.length-1]);
		
		
	}
// 2 for loops means its complexity will be n2
}
