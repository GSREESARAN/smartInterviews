import java.util.ArrayList;

class Numbers {
  public int[] leaders(int[] nums) {
    ArrayList<Integer> res = new ArrayList<>();
    int n = nums.length;
    int max = nums[nums.length - 1];
    res.add(nums[n - 1]);
    for (int i = n - 2; i >= 0; i--) {
      if (nums[i] > max) {
        res.add(nums[i]);
        max = nums[i];
      }
    }
    int[] result = new int[res.size()];
    for (int i = res.size()-1; i >=0; i--) {
      result[res.size()-1-i] = res.get(i);
    }
    return result;
  }

  public static void Swap(int[] result, int start, int end) {
    while (start < end) {
      int temp = result[start];
      result[start] = result[end];
      result[end] = temp;
      start++;
      end--;
    }
  }
}
