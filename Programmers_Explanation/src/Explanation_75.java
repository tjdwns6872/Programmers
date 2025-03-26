public class Explanation_75 {
    public static void main(String[] args) {
        solution("string", 3);
    }

    public static String solution(String my_string, int k) {
        // 반복문을 활용한 풀이
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++){
            sb.append(my_string);
        }
        return sb.toString();
        // repeat(문자열 반복 메서드)를 사용한 풀이
        // my_string.repeat(k);
    }
}
