public class ques7 {
    public static void moveZeroes(int[] nums) {
        int i = 0; 
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args)
    {
        int[] array1 = { 1,12,13,0,4,0 };

        moveZeroes(array1);
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
    }
}
