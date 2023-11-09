package Doubt_Class_4;
import java.util.*;
public class Subsets_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		PrintSubset(arr, 0,ll, ans);
		System.out.println(ans);
	}
	public static void PrintSubset(int[] arr, int idx,List<Integer> ll,List<List<Integer>> ans)
	{
		//System.out.println(ans);
		ans.add(new ArrayList<Integer>(ll));
		for(int i=idx;i<arr.length;i++)
		{
			ll.add(arr[i]);
			PrintSubset(arr, i+1, ll, ans);
			ll.remove(ll.size()-1);
		}
	}

}
