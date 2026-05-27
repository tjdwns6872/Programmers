public class Explanation_107 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(45));
    }
    static class Solution {
        public int solution(int n) {
            String ternary = Integer.toString(n, 3);
            StringBuffer sb = new StringBuffer(ternary);
            return Integer.valueOf(Integer.parseInt(sb.reverse().toString(), 3));
        }
    }
}
