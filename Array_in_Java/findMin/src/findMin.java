public class findMin {
    public static void main(String[] args) {
        // o day co the nang cap khai bien nhu max nhung luoi qua @@! di ngu thoi
        int [] arr = {5,9,13,28,-3,-62,0,10};
        // ham minValue lay vi tri trong mang roi gan cho bien index ( clean code )
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int[]array){
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
