package Doubt_Class_3;

public class Subset_problem_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		int target = 3;
		SubsetPrint(arr, 0, "", target,0);
	}
	public static void SubsetPrint(int[] arr, int i, String ans, int target, int sum)
	{
		if(i==arr.length)
		{
			if(sum==target) {
				System.out.print(ans+" ");
			}
			return;
		}
		SubsetPrint(arr, i+1, ans+ arr[i]+" ", target, sum + arr[i]);
		SubsetPrint(arr, i+1, ans, target, sum);
	}
}
