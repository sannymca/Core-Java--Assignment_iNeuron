
public class Q3Bubblesort
{
	
	public static void main(String[] args) 
	{
		int arr[]= {9,8,7,6,5,43,25};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				}
			}
		}
		for(int el:arr)
		{
			System.out.print(el+" ");
		}
		

	}

}
