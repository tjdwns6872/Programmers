public class Explanation_84 {
    public static void main(String[] args) {
        solution(4);
    }
    public static String solution(int n) {
        String answer = "수박";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(answer.charAt(i%2));
        }
        return sb.toString();
    }
}
