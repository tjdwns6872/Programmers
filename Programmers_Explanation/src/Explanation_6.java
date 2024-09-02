/**
 * Explanation_1
 */
public class Explanation_6 {

    public static void main(String[] args) {
        int a = solution(1, 2);
    }

    public static int solution(int num1, int num2) {
        double n = ((double)num1/num2)*1000;
        int answer = (int) n;
        return answer;
    }
}