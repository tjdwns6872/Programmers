public class Explanation_81 {
    public static void main(String[] args) {
        solution("123456789");
    }
    public static int solution(String num_str) {
        int answer = 0;
        char[] ch = num_str.toCharArray();
        for(char c : ch){
            answer += (c-48);
        }
        return answer;
    }
}
