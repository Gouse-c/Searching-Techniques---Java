import java.util.Scanner;
class LinearSearch1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the target element : ");
		int target = sc.nextInt();
		int index = linearSearch(a,target,n);
		if(index !=-1)
		{
			System.out.println("Element is found at index : "+index);
		}
		else
		{
			System.out.println("Element is not found...");
		}
	}
	public static int linearSearch(int a[],int target,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(a[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
}
		