public class _40_1TestStatic {
    public static void main(String[] args) {
        int numbers[]={12,13,42,32,15,156,23,51,12};
        int max= findMax (numbers);
        System.out.println (max);
    }
    static int  findMax (int[]numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        return max;
    }}

