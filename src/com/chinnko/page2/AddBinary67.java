package page2;

public class AddBinary67 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s = new String("abc");
        System.out.println(s1.equals(s));
        System.out.println(new AddBinary67().addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        char[] one = a.toCharArray();
        char[] two = b.toCharArray();

        int x = one.length - 1;
        int y = two.length - 1;

        char[] chars = new char[one.length + two.length];
        boolean add = false;
        StringBuilder stringBuilder = new StringBuilder();


        return stringBuilder.reverse().toString();
    }
}
