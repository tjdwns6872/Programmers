public class Explanation_90 {
    public static void main(String[] args) {
        solution(3, 12);
    }
    public static int[] solution(int n, int m) {
        // 일반 공식을 대입하여 푼 풀이
        // int[] answer = new int[2];
        // // 최대공약수 구하는 식
        // for(int i = 1; i <= n; i++){
        //     if(n%i == 0 && m%i == 0) answer[0] = i;
        // }
        // // 최대공배수 구하는 식
        // answer[1] = (n*m)/answer[0];
        // return answer;

        // 유클리드 호제법
        int[] answer = new int[2];
        answer[0] = gbc(n, m);
        answer[1] = n*m/gbc(n, m);
        return answer;
    }
    static int gbc(int n, int m){
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
}
