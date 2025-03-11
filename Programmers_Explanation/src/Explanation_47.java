public class Explanation_47 {
    public static void main(String[] args) {
        solution(new String[]{"We", "are", "the", "world!"});
    }
    public static int[] solution(String[] strlist) {
        // 반복문을 활용한 풀이
        // 각 원소에 크기를 배열에 저장하고 리턴하므로 strlist와 배열 크기가 같다고 판단
        int[] answer = new int[strlist.length];
        // strlist 탐색을 위한 반복문
        for(int i = 0; i < strlist.length; i++){
            // answer[i]에 strlist[i]에 원소 크기를 length()를 통해 구하고 삽입
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
