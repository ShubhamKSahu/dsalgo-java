
// brute force approach
public class rainWaterTrapping {
    public static int trappedWater(int[] height) {
        int n = height.length;
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int leftMax = Integer.MIN_VALUE;

            for (int j = 0; j <= i; j++) {
                if (height[j] > leftMax) {
                    leftMax = height[j];
                }
            }
            int rightMax = Integer.MIN_VALUE;
            for (int j = i; j < n; j++) {
                if (height[j] > rightMax) {
                    rightMax = height[j];
                }
            }
            int waterLevel = Math.min(leftMax, rightMax);
            trappedWater = trappedWater + (waterLevel - height[i]);
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 3, 2, 5 };
        int totalTrappedWater = trappedWater(height);
        System.out.println(totalTrappedWater);
    }
}
