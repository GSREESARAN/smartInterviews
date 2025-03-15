public class LongestMountain {
    public static int longestMountain(int[] arr) {
        int n = arr.length, maxLen = 0, i = 1;

        while (i < n - 1) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int left = i - 1, right = i + 1;

                while (left > 0 && arr[left - 1] < arr[left]) left--;
                while (right < n - 1 && arr[right] > arr[right + 1]) right++;

                maxLen = Math.max(maxLen, right - left + 1);
                i = right;
            } else {
                i++;
            }
        }

        return maxLen;
    }
}
