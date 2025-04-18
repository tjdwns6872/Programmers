import java.util.*;

public class Explanation_104 {
    public static void main(String[] args) {
        solution("[](){}");
    }
    public static int solution(String s) {
        int answer = 0;
        int n = s.length();
        Deque<Character> queue = new LinkedList<>();

        // 큐 초기화
        for(char ch : s.toCharArray()){
            queue.add(ch);
        }

        // 괄호 문자열 회전 검사
        for(int i = 0; i < n; i++){
            Deque<Character> copy = new LinkedList<>(queue);
            if(isValid(copy)){
                answer++;
            }
            queue.add(queue.poll());
        }

        return answer;
    }
    static boolean isValid(Deque<Character> deque){
        Stack<Character> stack = new Stack<>();
        for(char ch : deque){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(
                    (ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')
                ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
