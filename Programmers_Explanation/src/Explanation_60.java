public class Explanation_60 {
    public static void main(String[] args) {
        solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, 
            new int[][]{{0,4}, {1,2}, {3,5}, {7,7}}
        );
    }
    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_strings.length; i++){
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }
        return sb.toString();
    }
}
