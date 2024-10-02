/*
다음 큰 숫자
*/
public class Explanation_23 {

    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    // 반복문으로 일일이 나누어서 나눠떨어지는 값을 더하는 방식
    // public static int solution(int n) {
    //     int count = 0;
    //     for(int i = 1; i <= n; i++){
    //         if(n % i == 0){
    //             count += i;
    //         }
    //     }
    //     return count;
    // }

    //다른 사람이 푼 풀이
    public static int solution(int n) {
        int answer = 0;
        // i는 1이고 i가 n/2보다 작거나 같을 때 ex) i <= 6(n==12일때)
        for(int i = 1 ; i<=n/2;i++){
            // n%i==0 ex) 12 / 2 = 6, 12 % 2 = 6
            if(n%i==0){
                // answer = 0 + 2
                answer+=i;
            }
        }
        return answer;
    }
}
