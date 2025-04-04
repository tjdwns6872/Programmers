public class Explanation_92 {
    public static void main(String[] args) {
        solution(78);
    }
    // 문자열을 사용힌 풀이(시간 복잡도로 인하여 효율성 개선 필요)
    // public static int solution(int n) {
    //     int answer = n;
    //     while (true) {
    //         if(answer > n){
    //             String Nbinary = Integer.toBinaryString(n).replaceAll("0", "");
    //             String Abinary = Integer.toBinaryString(answer).replaceAll("0", "");
    //             if(Nbinary.length() == Abinary.length()){
    //                 break;
    //             }
    //         }
    //         answer++;
    //     }
    //     return answer;
    // }
    // 비트 연산을 통한 풀이
    public static int solution(int n) {
        int answer = n+1;
        // bitCount 비트 연산을 통해 n을 2진법으로 표현했을 때 1의 개수를 찾는다.
        int count = Integer.bitCount(n);
        while(true){
            // answer은 n+1로 시작했으므로 n보다 작은 수가 들어있을 수 없다
            // 그러므로 1의 개수가 같은지만 판단하고 break하면 된다.
            if(count == Integer.bitCount(answer)){
                break;
            }
            answer++;
        }
        return answer;
    }
}
