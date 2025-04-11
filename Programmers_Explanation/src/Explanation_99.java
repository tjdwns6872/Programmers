public class Explanation_99 {
    public static void main(String[] args) {
        solution(1);
    }

    // 피보나치 수열을 사용한 풀이 - 동적 계획법(DP)문제
    public static long solution(int n) {
        // 피보나치 수열의 공식은 f[i] = f[i-1] + f[i-2] 이므로
        // 배열을 만들 필요가 없는 2이하의 값은 그대로 리턴
        if(n <= 2){
            return n;
        }

        // 피보나치 수열을 저장할 값의 배열을 n+1의 크기 만큼 생성
        // 배열은 0부터 시작하므로 +1을 하여 n의 크기를 맞춰준다
        long[] num = new long[n+1];

        // 배열의 1, 2번 인덱스는 각각의 수을 넣어 저장한다.
        num[1] = 1;
        num[2] = 2;

        // 배열의 1,2번 인덱스는 이미 채워져있으므로 i를 3부터 시작하여 계산한다.
        for(int i = 3; i <= n; i++){
            num[i] = (num[i-1] + num[i-2]) % 1234567;
        }
        return num[n];
    }
}
