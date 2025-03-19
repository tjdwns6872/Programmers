public class Explanation_59 {
    public static void main(String[] args) {
        solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}});
    }
    public static int solution(int[][] arr) {
        int answer = 1;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[i][j] != arr[j][i]) {
                    answer = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
