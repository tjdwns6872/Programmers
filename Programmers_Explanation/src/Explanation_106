public class Explanation_106 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("try hello world"));
    }
    static class Solution {
        public String solution(String s) {
            String answer = "";
            int index = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' '){
                    index = 0;
                    answer += s.charAt(i);
                }else{
                    answer += (index % 2) == 0 ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i));
                    index++;
                }
            }
            return answer;
        }
    }
}
