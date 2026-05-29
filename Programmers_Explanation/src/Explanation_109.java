public class Explanation_109 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("a B z", 4));
    }
    static class Solution {
        public String solution(String s, int n) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(ch >= 'a' && ch <= 'z'){
                    ch = (char) ((ch - 'a' + n) % 26 + 'a');
                    sb.append(ch);
                }else if(ch >= 'A' && ch <= 'Z'){
                    ch = (char) ((ch - 'A' + n) % 26 + 'A');
                    sb.append(ch);
                }else{
                    sb.append(ch);
                }
            }
            return sb.toString();
        }
    }
}
