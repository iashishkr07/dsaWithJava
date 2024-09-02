public class maxPro {
    public static void main(String[] args) {
        maxPro mp = new maxPro();
        int[] nums = { 90, 20, 30, 25, 150 };
        int[] result = mp.maxProduct(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public int[] maxProduct(int[] nums) {
        int[] max = new int[2];
        max[0] = Integer.MIN_VALUE;
        max[1] = Integer.MIN_VALUE;
        int total=0;
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1;j<nums.length;j++){
                if (nums[i] * nums[j] > total) {
                    total = nums[i] * nums[j];
                    max[0] = nums[i];
                    max[1] = nums[j];
                }                
            }
        }
        return max;
    }
}
