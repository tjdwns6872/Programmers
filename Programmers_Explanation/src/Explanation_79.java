import java.util.*;

public class Explanation_79 {
    public static void main(String[] args) {
        solution(new String[]{"0123456789","9876543210","9999999999999"}, 50000, 5, 5);
    }
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(String num : intStrs){
            if(k < Integer.valueOf(num.substring(s, s+l))){
                list.add(Integer.valueOf(num.substring(s, s+l)));
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
