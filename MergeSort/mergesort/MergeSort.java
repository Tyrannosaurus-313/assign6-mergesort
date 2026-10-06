package mergesort;

public class MergeSort 
{

	public static void main(String[] args) 
	{
		int[] array1 = {11,43,87,27,54,8,32,71,44,12};
		
		showArray(array1);
		mergeSort(array1);
		showArray(array1);		
	}
	
	public static void showArray(int[] theArray) 
	{
		int index;
		
		System.out.printf("[");
		for(index=0;index<theArray.length;index++) 
		{
			if(index!=0) 
			{
				System.out.printf(", ");
			}
			System.out.printf("%d",theArray[index]);
		}
		System.out.printf("]\n");
	}
	

	
	private static void mergeSort(int[] theArray, int left, int right) {
		//**************************************************************
		//*  Recursive Merge Sort                                      *
		//*------------------------------------------------------------*
		//*  1. Divide or partition the array section into 2 halves.   *
		//*  2. Create a subArray for each partition (half)            *
		//*  3. Merge the two subArrays to create one sorted array     *
		//*  4. Replace the original array section with the merged     *
		//*     array.                                                 *
		//**************************************************************
		
		if (theArray.length > 1) //Split
		{
			int mid = (left + right) / 2;
			System.out.println(left + " " + right + " " + mid);
			int[] leftArray = new int[mid + 1];
			int[] rightArray = new int[right - mid];
			for (int i = 0; i <= mid; i++)
			{
				System.out.println(i + " " + mid + " " + leftArray.length + " " + theArray.length);
				leftArray[i] = theArray[i];
			}
			System.out.printf("Left Part: ");
			showArray(leftArray);
			for (int i = mid; i < right; i++)
			{
				System.out.println(i + " " + (i - mid) + " " + rightArray.length);
				rightArray[i - mid] = theArray[i];
			}
			System.out.printf("Right Part: ");
			showArray(rightArray);
			mergeSort(leftArray, left, mid);
			mergeSort(rightArray, mid, right);
		}
		else if (theArray.length == 1)
		{
			System.out.println(theArray[0]);
		}
		
	}
	
	public static void mergeSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive mergeSort *
		//**********************************************
		mergeSort(array,0,array.length-1);
	}
}
