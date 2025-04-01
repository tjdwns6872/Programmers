public class Explanation_83 {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2});
    }
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){
            int sum = a[i] * b[i];
            answer += sum;
        }
        return answer;
    }
}
