public class _137_2DArray {
    public static void main(String[] args) {
        int [][] n={{1,3},{2,4}};
        for (int i=n.length-1;i>=0;i--){
            for (int j= n[i].length-1;j>=0;j--){
                System.out.println (n[i][j]);
            }
        }
    }
}
