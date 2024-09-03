/**
 * 문자열 뒤집기
 */
public class Explanation_13 {

    public String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length()-1; i >= 0; i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}