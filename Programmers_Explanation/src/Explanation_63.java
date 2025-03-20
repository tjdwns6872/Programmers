public class Explanation_63 {
    public static void main(String[] args) {
        solution(new int[]{444, 555, 666, 777}, 100);
    }
    public static int[] solution(int[] arr, int n) {
        for(int i = arr.length%2==0 ? 1 : 0; i < arr.length; i+=2){
            arr[i] += n;
        }
        return arr;
    }
}
