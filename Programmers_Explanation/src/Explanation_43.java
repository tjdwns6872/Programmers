public class Explanation_43 {
    public static void main(String[] args) {
        solution("01033334444");
    }
    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < phone_number.length(); i++){
            // 반복문 중 i가 전화번호의 크기에서 4를 뺀 값보다 작으면 * 삽입
            if(i < phone_number.length()-4){
                sb.append("*");
            }else{
                // charAt를 통해 문자열에서 인덱스를 통해 값을 추출하여 삽입
                sb.append(phone_number.charAt(i));
            }
        }
        return sb.toString();

        // 문자열을 문자 배열로 변환하여 푼 풀이
        // char[] ch = phone_number.toCharArray();
        // // 반복문을 통해 뒷 4자리를 제외한 모든 값 *로 변경
        // for(int i = 0; i < ch.length - 4; i++){
        //     ch[i] = '*';
        // }
        // return String.valueOf(ch);

        // 정규 표현식으로 통한 풀이
        // return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
