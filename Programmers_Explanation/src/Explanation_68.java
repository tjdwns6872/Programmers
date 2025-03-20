public class Explanation_68 {
    public static void main(String[] args) {
        solution(new String[]{"abc", "def", "ghi"}, "ef");
    }
    public static String solution(String[] str_list, String ex) {
	    StringBuilder sb = new StringBuilder();
	    for(String str : str_list){
		    if(!str.contains(ex)){
			    sb.append(str);
		    }
	    }
        return sb.toString();
    }
}
