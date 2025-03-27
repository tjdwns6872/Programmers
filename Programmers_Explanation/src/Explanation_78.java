import java.util.*;

public class Explanation_78 {
    public static void main(String[] args) {
        solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false});
    }
    public static int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        // for(int i = 0; i < arr.length; i++){
        //     if(!stack.isEmpty() && !flag[i]){
        //         for(int j = 0; j < arr[i]; j++){
        //             stack.pop();
        //         }
        //     }else{
        //         for(int j = 0; j < arr[i]*2; j++){
        //             stack.push(arr[i]);
        //         }
        //     }
        // }
        // 반복문 코드 변환(중복코드 삭제)
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i] * (flag[i]? 2 : 1); j++){
                if(flag[i]) stack.push(arr[i]);
                else stack.pop();
            }
        }
        int[] answer = new int[stack.size()];
        for(int i = 0; i < stack.size(); i++){
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
