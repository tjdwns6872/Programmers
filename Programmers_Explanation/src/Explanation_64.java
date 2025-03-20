public class Explanation_64 {
    public static void main(String[] args) {
        solution(new int[]{49,13}, new int[]{70, 11, 2});
    }
    public static int solution(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length){
            return arr1.length > arr2.length ? 1 : -1;
        }

        for(int i = 1; i < arr1.length; i++){
            arr1[0] += arr1[i];
            arr2[0] += arr2[i];
        }
        if(arr1[0] != arr2[0]){
            return arr1[0] > arr2[0] ? 1 : -1;
        }

        return 0;
    }
}
