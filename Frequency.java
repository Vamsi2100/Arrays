public class Frequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 3, 1, 2, 1};

        int[] frequencyarray = new int[array.length];

        for(int i = 0; i < frequencyarray.length; i++){
            frequencyarray[i] = 0;
        }
        for(int i=0; i< array.length;i++){
            int element = array[i];
            frequencyarray[element]++;
        }

        for (int i = 0; i<frequencyarray.length;i++)
            if (frequencyarray[i]>0)
                System.out.println(i + "occurs" + frequencyarray[i] + "times");

    }
}
