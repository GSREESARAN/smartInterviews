import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
  public List<Integer> spiralOrder(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;
    int top = 0;
    int bottom = n - 1;
    int left = 0;
    int right = m - 1;
    List<Integer> res = new LinkedList<>();
    while (top <= bottom && left <= right) {
      for (int i = left; i <= right; i++) {
        res.add(matrix[top][i]);
      }
      top++;
      for (int i = top; i <= bottom; i++) {
        res.add(matrix[i][right]);
      }
      right--;
      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          res.add(matrix[bottom][i]);
        }
        bottom--;
      }
      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          res.add(matrix[i][left]);
        }
        left++;
      }
    }
    return res;
  }
  // return ans;
}
 
