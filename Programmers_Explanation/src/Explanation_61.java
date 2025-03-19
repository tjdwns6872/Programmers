public class Explanation_61 {
    public static void main(String[] args) {
        solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7});
    }
    public static String solution(String my_string, int[] index_list) {
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < index_list.length; i++){
	    	sb.append(my_string.charAt(index_list[i]));
	    }
	    return sb.toString();
    }
}
