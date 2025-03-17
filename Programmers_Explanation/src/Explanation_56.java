public class Explanation_56 {
    public static void main(String[] args) {
        solution("ProgrammerS123", 11);
    }
    public static String solution(String my_string, int n) {
        int len = my_string.length();
        String answer = my_string.substring(len-n);
        return answer;
    }
}
