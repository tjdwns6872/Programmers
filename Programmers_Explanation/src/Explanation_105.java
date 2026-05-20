public class Explanation_105 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("3141592", "271"));
    }
    static class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            for(int i = 0; i < t.length(); i++){
                if(p.length()+i > t.length()) break;
                String tStr = t.substring(i, p.length()+i);
                if(Long.parseLong(tStr) <= Long.parseLong(p)) answer++;
            }
            return answer;
        }
    }
}
