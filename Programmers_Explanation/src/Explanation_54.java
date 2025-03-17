public class Explanation_54 {
    public static void main(String[] args) {
        solution("AbCdEfG", "aBc");
    }
    public static int solution(String myString, String pat) {
        int answer = 0;
        if(myString.toUpperCase().contains(pat.toUpperCase())){
            answer = 1;
        }
        return answer;
    }
}
