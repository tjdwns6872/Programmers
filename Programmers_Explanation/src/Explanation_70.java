import java.util.*;

public class Explanation_70 {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1,3},{0,4}});
    }
    public static int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                list.add(arr[j]);
            }
        }
        int[] answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
