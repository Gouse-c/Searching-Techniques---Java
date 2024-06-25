import java.util.Scanner;
import java.util.Arrays;
class BinarySearch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int left = 0;
		int right = n-1;
		int mid = -1;
		System.out.println("Enter the target Element : ");
		int target = sc.nextInt();
		while(left<=right)
		{
			mid=(left+right)/2;
			if(a[mid]==target)
			{
				System.out.println("Element is found at index is : "+mid);
				break;
			}
			else if(a[mid]<target)
			{
				left = mid+1;
			}
			else
			{
				right = mid-1;
			}
		}
	}
}