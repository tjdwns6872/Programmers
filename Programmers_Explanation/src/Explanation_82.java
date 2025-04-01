public class Explanation_82 {
    public static void main(String[] args) {
        solution("qwer");
    }
    public static String solution(String s) {
        int len = s.length();
        int center = len/2;
        StringBuilder sb = new StringBuilder();
        sb.append(len%2==0? s.substring(center-1, center+1) : s.charAt(center));
        return sb.toString();
    }
}
