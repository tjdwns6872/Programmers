/**
 * Explanation_1
 */
public class Explanation_8 {

    public static void main(String[] args) {
        int a = solution(0);
    }

    public static int solution(int n) {
        int answer = 0;
        for(int i = 0; i <= n; i+=2){
            answer += i;
        }
        return answer;
    }
}