public class StringIdx_146 {
    public static void main(String[] args) {
        String[] str =new String[2];
        int idx =0;
        for (String s: str){
            str[idx].concat ("element"+idx);
            idx++;
    }
        for (idx =0;idx<str.length;idx++){
            System.out.println (str[idx]);
        }

}}
//Exception in thread "main" java.lang.NullPointerException:
// Cannot invoke "String.concat(String)" because "str[idx]" is null