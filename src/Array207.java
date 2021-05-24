public class Array207 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];

        arr[0]= new int[]{1,3,5,7};
        arr[1]=new int[]{};

        for (int[] a:arr){

           for (int i=0; i< arr.length;i++){
                System.out.println (a[i]+ " ");

            }
            System.out.println ();
        }
    }}

//This is because the outer for loops will iterate over the contents of the
// array “arr” which consists of two “sub” arrays, so to say. Since
// the arr.length is 2, the outer for loop will iterate twice.
// In the first iteration, the value of “a” is going to be the first sub array
// (i.e. {1, 3, 5, 7}), and in the second iteration the value of “a” is going to be {1, 3}
// . Now comes the second for loop which iterates over the elements
// of each array. Since the for loop condition is i<arr.length, it means
// that "i" will start in 0 and stops at 1. Meaning that it will only print
// a[0] and a[1] for each of the arrays. Therefore, the result is going to be 1 3
// followed by an empty line (from the println at the end of each inner for loop) then 13
