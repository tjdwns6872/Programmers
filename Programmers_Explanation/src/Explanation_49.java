public class Explanation_49 {
    public static void main(String[] args) {
        solution(new String[]{"AAA","BBB","CCC","DDD"});
    }
    public static String[] solution(String[] strArr) {
        // 삼항 연산자 활용
        // 선언 할 배열의 크기는 strArr의 배열의 크기랑 동일
        String[] answer = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            // 홀수, 짝수 구분을 위해 i%2==0으로 판단
            answer[i] = i%2==0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return answer;
    }
}
