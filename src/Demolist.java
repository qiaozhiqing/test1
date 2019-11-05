public class Demolist{
    public static void main(String[] args) {
        String str1= "hello world";
        String str2="abcd world";
        boolean match=str1.regionMatches(6,str2,5,4);
        System.out.println(match);
    }
}