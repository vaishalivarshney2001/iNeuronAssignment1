import java.util.Arrays;

public class ques6 {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); 
        for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i+1]) {
                    return true;
                }
        }
        return false;
    }


    public static void main(String[] args)
    {
        int[] array1 = { 1,2,3,0,0,0 };

        boolean ans = containsDuplicate(array1);
        System.out.print(ans);
    }
    
}
