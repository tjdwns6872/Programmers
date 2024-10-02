/*
나머지가 1이 되는 수 찾기
*/
public class Explanation_25 {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    //반복문, if문을 분리한 코드
    // public static int solution(int n) {
    //     int i = 1;
    //     for(i = 1; i <= n; i++){
    //         if(n%i == 1){
    //             break;
    //         }
    //     }
    //     return i;
    // }

    //다른 사람 풀이
    public static int solution(int n) {
        int answer = 1;
        // 나머지 값이 1이 아니면 반복
        while(n % answer != 1){
            answer++;
        }
        return answer;
    }
}
