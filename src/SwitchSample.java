public class SwitchSample {
    public static void main(String[] args) {
        char colorCode = 'y';
        int color =0;
        switch (colorCode) {
            case 'r':
                 color = 100;
                break;

            case 'b':
                color = 10;
                break;

            case 'y':
                color = 1;
                break;

        }
        System.out.println (color);

    }}
