
// brute force approach, time complexity O(n^2)
// public class rainWaterTrapping {
//     public static int trappedWater(int[] height) {
//         int n = height.length;
//         int trappedWater = 0;
//         for (int i = 0; i < n; i++) {
//             int leftMax = Integer.MIN_VALUE;

//             for (int j = 0; j <= i; j++) {
//                 if (height[j] > leftMax) {
//                     leftMax = height[j];
//                 }
//             }
//             int rightMax = Integer.MIN_VALUE;
//             for (int j = i; j < n; j++) {
//                 if (height[j] > rightMax) {
//                     rightMax = height[j];
//                 }
//             }
//             int waterLevel = Math.min(leftMax, rightMax);
//             trappedWater = trappedWater + (waterLevel - height[i]);
//         }
//         return trappedWater;
//     }

//     public static void main(String args[]) {
//         int height[] = { 4, 2, 0, 3, 2, 5 };
//         int totalTrappedWater = trappedWater(height);
//         System.out.println(totalTrappedWater);
//     }
// }



// Approch 2: prefix max array TC: O(n), SC: O(n)
// public class rainWaterTrapping {
//     public static int calculateTrappedWater(int[] height) {
//        int n = height.length;
//        int trappedWater = 0;
//        // prefix leftmax array
//        int leftMaxArr[] = new int[n];
//        leftMaxArr[0] = height[0];
//        for(int i = 1; i< n; i++){
//         leftMaxArr[i] = Math.max(leftMaxArr[i-1], height[i]);
//        }
       
//        // prefix rightmax array
//        int rightMaxArr[] = new int[n];
//        rightMaxArr[n-1] = height[n-1];
//        for(int i = n-2; i>=0; i--){
//         rightMaxArr[i] = Math.max(rightMaxArr[i+1], height[i]);
//        }
//        // calculate water level 
//        for(int i = 0; i< n ; i++){
//            int waterLevel = Math.min(leftMaxArr[i], rightMaxArr[i]);
//            // calculate trapped water
//            trappedWater += waterLevel- height[i]; 
//        }
//        return trappedWater;
//     }

//     public static void main(String[] args) {
//         int[] height = {3, 5, 4, 6, 2, 7, 3, 9, 0, 5};
//         System.out.println(calculateTrappedWater(height));
//     }
// }


// approach 3: two pointer approach TC= O(n) SC = O(1)
public class rainWaterTrapping {

    public static int calculateTrappedWater(int[] height) {
        if (height == null || height.length == 0) return 0;

        int trappedWater = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {3, 5, 4, 6, 2, 7, 3, 9, 0, 5};
        System.out.println(calculateTrappedWater(height));
    }
}

