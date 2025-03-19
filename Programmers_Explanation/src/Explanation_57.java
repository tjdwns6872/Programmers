import java.util.*;

public class Explanation_57 {
    public static void main(String[] args) {
        solution("programmers");
    }
    public static String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }

}
