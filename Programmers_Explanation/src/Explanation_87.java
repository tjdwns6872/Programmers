public class Explanation_87 {
    public static void main(String[] args) {
        solution("a234");
    }
    public static boolean solution(String s) {
        // try_catch 사용한 풀이
        // boolean answer = true;
        // if(s.length() == 4 || s.length() == 6){
        //     try {
        //         Integer.valueOf(s);
        //     } catch (NumberFormatException e) {
        //         answer = false;
        //     }
        // }else{
        //     answer = false;
        // }
        // return answer;
        // 정규 표현식 풀이
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6){
            String reg = "\\d+";
            if(s.matches(reg)){
                answer = true;
            }
        }
        return answer;
    }
}
