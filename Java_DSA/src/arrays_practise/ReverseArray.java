package arrays_practise;

public class ReverseArray {

	public static void main(String[] args) {
		ReverseArray arr_obj =new ReverseArray();
		arr_obj.array_rev();
		

	}
	public void array_rev()
	{
		int[] ar1 = {2,3,4,6,6,9,8,12,10,15,12,18};
		
		for(int i=ar1.length-1;i>=0;i--)
		{
			System.out.print(" "+ar1[i]);
		}
	}

}
