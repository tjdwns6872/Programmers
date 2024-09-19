/**
 * 이진 변환 반복하기
 */
public class Explanation_20 {

    public static void main(String[] args) {
        System.out.println(solution("110010101001"));
    }

    //직접 푼 코드
    // public static int[] solution(String s) {
    //     int sLen = 0;
    //     String temp = s;
    //     int result = 0;
    //     int num = 0;
        
    //     while (!temp.equals("1")) {
    //         int del = zeroDel(temp);
    //         sLen = temp.length() - del; 
    //         temp = Integer.toBinaryString(sLen);
    //         result += del;
    //         num++;
    //     }
    //     int[] answer = {num, result};
    //     return answer;
    // }

    // public static int zeroDel(String s){
    //     int count = 0;
    //     for(int i = 0; i < s.length(); i++){
    //         if(s.charAt(i) == '0'){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

  // 제출 후 참고한 코드
  public static int[] solution(String s) {
        int[] answer = new int[2];
        int temp;
        while( !s.equals("1") ) {
            answer[1] += s.length();
            s = s.replaceAll("0", "");
            temp = s.length();
            s = Integer.toBinaryString(temp);
            //System.out.println("s : " + s ); 
            answer[0]++;
            answer[1] -= temp;
        }
        return answer;  
    }
}
