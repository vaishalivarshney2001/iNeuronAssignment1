public class ques8 {
    public static int[] findErrorNums(int[] nums) {
        int ans[] = {-1,-1};
        for(int i=0;i<nums.length;i++)
        {
            int curr=Math.abs(nums[i])-1;
            if(nums[curr]<0)
                ans[0] = curr + 1;
            else
                nums[curr] = nums[curr] * -1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                ans[1] = i + 1;
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,4};
        int[] ans = findErrorNums(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    
}
