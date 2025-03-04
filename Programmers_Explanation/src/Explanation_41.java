
public class Explanation_41 {
    //음양 더하기
    public static void main(String[] args) {
        System.out.println(solution(new int[] {4, 7, 12}, new boolean[] {true, false, true}));
    }    

    // 문자열로 변환하여 풀이
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++){
            // 만약 i번째의 signs가 false일 때
            if(!signs[i]){
                // i번째에 있는 absolutes를 문자열로 변환하여 -와 합친 후 다시 정수형으로 변환하여 배열에 저장
                absolutes[i] = Integer.parseInt("-"+String.valueOf(absolutes[i]));
            }
        }
        for(int i = 0; i < absolutes.length; i++){
            answer += absolutes[i];
        }
        return answer;

        //다른 사람풀이
        // for(int i = 0; i < signs.length; i++){
        //     삼항연산자를 통해 true/false를 판독 후 false일 경우 absolutes배열에 -1를 곱하여 음수로 전환
        //     answer += absolutes[i] * (signs[i]? 1: -1);
        // }
        // return answer;
    }
}
