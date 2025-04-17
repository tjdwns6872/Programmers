public class Explanation_102 {
    public static void main(String[] args) {
        solution(8, 4, 7);
    }
    public static int solution(int n, int a, int b) {
        int answer = 0;

        // A와 B가 같을 때까지 반복
        while (a != b) { 
            a = (a + 1) / 2;
            b = (b + 1) / 2;

            // 라운드 수 증가
            answer++;
        }
        return answer;
    }
}
