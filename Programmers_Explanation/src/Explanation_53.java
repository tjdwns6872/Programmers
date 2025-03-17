public class Explanation_53 {
    public static void main(String[] args) {
        solution(15, 5);
    }
    public static int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for(int i = 0; i< answer.length; i++){
            answer[i] = k*(i+1);
        }
        return answer;
    }
}
