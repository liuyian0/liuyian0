public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1,2,9,8,6,5,0};
        printArray(arr);
    }
    	private static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0 ; i < arr.length -1 ; i++){
        System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]);
        System.out.print("]");
	}
}
