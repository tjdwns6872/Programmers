import java.util.Stack;

/**
 * 올바른 괄호
 */
public class Explanation_17 {

    public static void main(String[] args) {
        System.out.println(solution(")()("));
    }

    public static boolean solution(String s) {
        // // 직접 푼 풀이
        boolean answer = true;
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push("(");
            }else if(s.charAt(i) == ')'){
                if(stack.size() < 1){
                    return false;
                }
                stack.pop();
            }
        }
        answer = stack.size() == 0 ? true : false;
        return answer;

        // 스택 없이 푸는 방법
        // boolean answer = false;
        // int count = 0;
        // for(int i = 0; i<s.length();i++){
        //     if(s.charAt(i) == '('){
        //         count++;
        //     }
        //     if(s.charAt(i) == ')'){
        //         count--;
        //     }
        //     if(count < 0){
        //         break;
        //     }
        // }
        // if(count == 0){
        //     answer = true;
        // }

        // return answer;
    }
}