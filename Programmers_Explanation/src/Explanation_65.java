import java.util.*;

public class Explanation_65 {
    public static void main(String[] args) {
        solution(new int[]{5,1,4});
    }
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            for(int i = 0; i < num; i++){
                list.add(num);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
