public class Tablica {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "a";
        imiona[1] = "b";
        imiona[2] = "c";

        System.out.println(imiona[0]);

        int[] lottoNumbers = new int[]{1, 2, 3, 4, 5, 6};
        int[] swaped = swapArray(lottoNumbers);
        for (int swap : swaped) {
            System.out.println(swap);
        }



    }
    public static int[] swapArray(int[] array)  {
        int counter = 0;
        int[] reversed = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[counter] = array[i];
            counter++;
        }
        return reversed;
    }
}
