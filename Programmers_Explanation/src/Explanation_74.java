public class Explanation_74 {
    public static void main(String[] args) {
        solution(new int[]{1,2,3}, "right");
    }

    // right일 경우 -> numbers 배열에 마지막 인덱스 값이 answer에 첫 인덱스 값으로
    // left일 경우 -> numbers 배열에 첫 인덱스 값이 answer에 마지막 인덱스 값으로
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        switch(direction){
            case "right":
                for(int i = 0; i < answer.length-1; i++){
                    answer[i+1] = numbers[i];
                }
                answer[0] = numbers[numbers.length-1];
                break;
            case "left":
                for(int i = 0; i < answer.length-1; i++){
                    answer[i] = numbers[i+1];
                }
                answer[answer.length-1] = numbers[0];
                break;
            default:
                throw new IllegalArgumentException();
        }
        return answer;
    }
}
