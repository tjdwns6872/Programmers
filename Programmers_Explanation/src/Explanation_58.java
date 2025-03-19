import java.util.*;

public class Explanation_58 {
    public static void main(String[] args) {
        solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12});
    }
    public static int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }
        for(int num : delete_list){
            list.remove(Integer.valueOf(num));
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
