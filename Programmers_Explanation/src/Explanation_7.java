/**
 * Explanation_1
 */
public class Explanation_7 {

    public static void main(String[] args) {
        int a = solution(0);
    }

    public static int solution(int angle) {
        int answer = 0;
        if(angle == 90){
            answer = 2;
        }else if(angle == 180){
            answer = 4;
        }else if(angle < 90){
            answer = 1;
        }else{
            answer = 3;
        }
        return answer;
    }
}