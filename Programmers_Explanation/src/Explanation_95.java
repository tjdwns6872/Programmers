public class Explanation_95 {
    public static void main(String[] args) {
        solution(10, 2);
    }
    public static int[] solution(int brown, int yellow) {
        // 전체 면적
        int total = brown + yellow;

        // 세로는 3부터(가운데 1개 이상의 yellow 타일이 들어가기 때문) sqrt(total) 까지 탐색
        // 제곱근을 사용한 이유 = width >= height 이므로
        // *sqrt는 제곱근을 수행
        for(int height = 3; height <= (int) Math.sqrt(total); height++){
            if(total % height == 0){ // 전체 면적이 height로 나누어 떨어지는 경우
                // 가로 계산
                int width = total / height; 

                // yellow 타일은 brown 타일 안 쪽에 위치하기 때문에
                // 상하좌우 -1씩 필요 => width-2, heigth-2이 됨
                if((width - 2) * (height - 2) == yellow){
                    return new int[] {width, height};
                }
            }
        }
        return new int[] {0, 0};
    }
}
