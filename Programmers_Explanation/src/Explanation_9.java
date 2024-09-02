/**
 * Explanation_1
 */
public class Explanation_9 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5}; 
        double a = solution(numbers);
    }

    public static double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i<numbers.length; i++){
            answer += numbers[i];
        }
        return answer/numbers.length;
    }
}