public class Explanation_93 {
    public static void main(String[] args) {
        solution(5);
    }
    public static int solution(int n) {
        int[] num = new int[n+1];
        num[1] = 1;

        for(int i = 2; i < num.length; i++){
            num[i] = (num[i-2] + num[i-1]) % 1234567;
        }
        return num[n];
    }
}
