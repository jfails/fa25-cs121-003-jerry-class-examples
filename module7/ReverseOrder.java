public class ReverseOrder {
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums);
        for (int i : nums)
        {
            System.out.print(i + " ");
        }

        for (int i = 0; i < nums.length / 2; i++)
        {
            int x = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = x;
        }

        System.out.println(nums);
        for (int i : nums)
        {
            System.out.print(i + " ");
        }
    }
}
