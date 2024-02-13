public class StringsComparison {
    public static void main(String[] args) {
        String s1 = "aditya";
        String s2 = new String("aditya");
        String s3 = "ADITYA";

        System.out.println(s1 == s2); // (==) this method compares the references of the string object
        System.out.println(s1.equals(s2)); // (equals) this method compares the content of the string
        System.out.println(s1 == s3);
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2 == s3);
    }

}
