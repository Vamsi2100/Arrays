public class SmallestElement {
    public static void main(String[] args) {
        int array [] = {1, 5, 8, -2, 20};
        int smallest = array[0];
        for (int i = 1; i < array.length; i++){

            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        System.out.println(smallest);
    }
}
