public class tracp_Rain_water {

    public static int trapWater(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        int waterTrapped = 0;
        int left = 0;
        int right = heights.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        while (left < right) {
            leftMax = Math.max(leftMax, heights[left]);
            rightMax = Math.max(rightMax, heights[right]);

            if (heights[left] < heights[right]) {
                waterTrapped += leftMax - heights[left];
                left++;
            } else {
                waterTrapped += rightMax - heights[right];
                right--;
            }
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        int[] roofElevation = { 2, 1, 3, 0, 1, 2, 3 };
        int trappedWater = trapWater(roofElevation);
        System.out.println("Units of water trapped: " + trappedWater);
    }
}
