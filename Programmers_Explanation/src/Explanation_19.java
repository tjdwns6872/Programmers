/**
 * JadenCase 문자열 만들기
 */
public class Explanation_19 {

    public static void main(String[] args) {
        System.out.println(solution("for the last week"));
    }

    public static String solution(String s) {
        // 직접 푼 풀이
        StringBuilder strb = new StringBuilder(s.toLowerCase());
        for(int i = 0; i < strb.length(); i++){
            if(i == 0 || strb.charAt(i-1) == ' '){
                strb.setCharAt(i, Character.toUpperCase(strb.charAt(i)));
            }
        }
        return strb.toString();
    }
}
