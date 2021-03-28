public class _40_TestStatic {
    public static void main(String[] args) {
        int numbers[]={12,13,42,32,15,156,23,51,12};
        int keys= findMax (numbers);
        System.out.println (keys);
    }
    static int  findMax (int[]numbers) {
        int keys = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > keys) {
                keys = numbers[i];
            }

        }
        return keys;


    }
}
