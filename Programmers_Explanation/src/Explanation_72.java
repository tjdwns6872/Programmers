public class Explanation_72 {
    public static void main(String[] args) {
        solution("abc", "aabcc");
    }
    public static int solution(String str1, String str2) {
        return str2.contains(str1)? 1 : 0;
    }
}
