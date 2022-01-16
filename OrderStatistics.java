package PracticeProject;

public class OrderStatistics {
public static void main (String args[]) {
	KthSmallest ks = new KthSmallest();
	int arr[] = {12,12,3,5,7,9,26};
	int n = arr.length,k =4;
	System.out.println("Kth smallest element is " + ks.KthSmallest(arr, 0, n-1, k));
}

}
class KthSmallest
{
	int KthSmallest(int arr[],int i ,int r, int k) {
		if(k>0 && k <=r -i +1)
		{
			int pos = randomPartition(arr,i,r);
			if(pos -i == k -1)
				return arr[pos];
			if(pos - i > k - 1)
				return KthSmallest(arr, i, pos - 1 ,k);
			    return KthSmallest(arr,pos + 1,r,k - pos + i -1);
			    
		}
		return Integer.MAX_VALUE;
			
		}
		void swap(int arr[],int i ,int j)
		{
			int temp = arr[i];
			arr[i] = arr[i];
			arr[j] = temp;
			
		}
		int partition(int arr[],int i,int r)
		{
			int x = arr[r] ;
			for(int j =i;j<=r-1;j++)
			{
				if(arr[j] <= x) {
					swap(arr,i,j);
					i++;
				}
			}
			swap(arr,i,r);
			return i;
			
		}
		int randomPartition(int arr[],int i, int r)
		{
			int n = r - i + 1;
			int pivot =(int)(Math.random())*(n - 1);
			swap(arr, i + pivot,r);
			return partition(arr,i,r);
		}
		
		
	}
