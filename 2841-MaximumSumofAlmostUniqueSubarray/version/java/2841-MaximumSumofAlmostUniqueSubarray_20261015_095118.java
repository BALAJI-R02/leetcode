// Last updated: 10/15/2026, 9:51:18 AM
1public class Solution {
2    public long maxSum(List<Integer> nums, int m, int k) {
3        long maxSum = 0;
4        long currentSum = 0;
5        Map<Integer, Integer> elementFrequency = new HashMap<>();
6        int left = 0;
7        for (int right = 0; right < nums.size(); right++) {
8            int currentElement = nums.get(right);
9            elementFrequency.put(currentElement, elementFrequency.getOrDefault(currentElement, 0) + 1);
10            currentSum += currentElement;
11            while (right - left + 1 > k) {
12                int leftElement = nums.get(left);
13                elementFrequency.put(leftElement, elementFrequency.get(leftElement) - 1);
14                if (elementFrequency.get(leftElement) == 0) {
15                    elementFrequency.remove(leftElement);
16                }
17                currentSum -= leftElement;
18
19                left++;
20            }
21            if (elementFrequency.size() >= m) 
22                maxSum = Math.max(maxSum, currentSum);
23        }
24        return maxSum;
25    }
26}