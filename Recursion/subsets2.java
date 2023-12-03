import java.util.*;
import java.util.ArrayList;
public class subsets2 {
    static List<List<Integer>> ans = new ArrayList<>();
    public static List<List<Integer>> subsetsWithDup(int[] nums) {        
        Arrays.sort(nums);
        List<Integer> ds = new ArrayList<>();
        getsubsets( 0, nums, ds);
        return ans;
    }
    public static void getsubsets(int idx, int nums[], List<Integer> ds) {
        ans.add(new ArrayList(ds));
        for (int i=idx; i<nums.length; i++) {
            if (i!=idx && nums[i]==nums[i-1]) {
                continue;
            }
            ds.add(nums[i]);
            getsubsets(i+1 , nums , ds);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> result = new ArrayList<>();
        result = subsetsWithDup(nums);
        System.out.print(result);
    }
}