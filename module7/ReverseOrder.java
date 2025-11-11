/**
 * An example to show reversing the order of things in an array.
 * @author Jerry Fails
 */
public class ReverseOrder {
    public static void main(String[] args) {
        
        // create an array
        int[] nums = {1, 2, 3, 4, 5};

        // print out the array
        System.out.println(nums);
        for (int i : nums)
        {
            System.out.print(i + " ");
        }

        // swap the elements in the array
        for (int i = 0; i < nums.length / 2; i++)
        {
            int x = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = x;
        }

        // print out the array
        System.out.println(nums);
        for (int i : nums)
        {
            System.out.print(i + " ");
        }
    }
}
