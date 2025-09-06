package arrays_practise;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotate_Array rotate =new Rotate_Array();
		rotate.rotate_array(6);

	}
	public void rotate_array(int d)
	{
		int[] arr={2,3,4,6,6,9,8,12,45,18,60};
		
		int temp = 0;
		 int n = arr.length;
		 for(int i=d;i<n;i++)
		 { 
			 temp=arr[i];
			 System.out.print(" "+temp);
		 }
		 
		 for(int j=0;j<d;j++)
		 {	 
			 temp=arr[j];
			 System.out.print(" "+temp);
		 }
		 		
	}

}
