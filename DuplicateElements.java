public class DuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 4, 2, 5, 3};
        for (int i = 0; i< array.length; i++){
            for (int j =i+1; j< array.length;j++){
                if (array[i]==array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
