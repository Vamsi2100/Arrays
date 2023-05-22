public class LargestElement {
    public static void main(String[] args) {

        int array [] = {1, 10, 15, 8, 4};

        int largest = array[0];

        for (int i = 1; i <array.length; i++) {
            if (array[i] > largest){
                largest = array[i];
            }
        }
        System.out.println(largest);
    }
}
