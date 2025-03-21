public class Explanation_71 {
    public static void main(String[] args) {
        solution(3);
    }
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                /* 배열은 생성할 때 0으로 자동 초기화 되므로
                int x = 0;
                if(i == j) x = 1;
                answer[i][j] = x;
                */
                // 이렇게 변경 가능
                answer[i][i] = 1;
            }
        }
        return answer;
    }
}
