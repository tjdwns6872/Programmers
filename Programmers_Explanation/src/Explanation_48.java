public class Explanation_48 {
    public static void main(String[] args) {
        solution("AbcAbcA", "AAA");
    }
    public static int solution(String str1, String str2) {
        // indexOf를 사용한 풀이
        int answer = 2;
        // indexOf는 제시한 문자열이 존재하면 해당 문자열이 존재하는 인덱스 값을
        // 존재하지 않으면 -1을 리턴하는 성질을 이용한 풀이
        if(str1.indexOf(str2) != -1) answer = 1;
        return answer;

        // contains를 이용한 풀이
        // contains는 제시한 문자열에 존재 여부를 boolean으로 반환
        // 반환 받은 boolean을 삼항연산자로 리턴
        // return str1.contains(str2)?1:2;
    }
}
