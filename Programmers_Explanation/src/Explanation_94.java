import java.util.*;

public class Explanation_94 {
    public static void main(String[] args) {
        solution("baab");
    }
    public static int solution(String s) {
        int answer = 0;
        // 두 개씩 짝을 지어 제거하는 문제이므로 문자열이 홀수면 무조건적으로 1개의 문자가 남게되므로 0을 리턴
        if(s.length() % 2 != 0){
            return answer;
        }
        // 스택 초기화
        Stack<Character> stack = new Stack<>();
        // 문자열을 문자형식으로 순회
        for(char ch : s.toCharArray()){
            // 스택이 비어있지 않으면서, 스택에서 가져온 값(가장 최근 값)과 문자가 같을 시 pop을 통해 스택에서 값 제거
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else{
                // 스택에 값 추가
                stack.push(ch);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
