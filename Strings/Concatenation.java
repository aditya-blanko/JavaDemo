// public class Concatenation {
//     public static void main(String[] args) {
//         
//     }
// }

public class Concatenation {
    public static void main(String[] args) {

        String s1 = "pw" + "java";
        String s2 = "pw" + "java" + "blr";
        String s3 = s1 + s2;
        System.out.println(s3);

        String str = "aditya" + 100 + 99;
        System.out.println(str);

        // String s1 = "pwjava"; // string will be stored in SCP(string constant pool)
        // String s2 = s1.concat("skill"); // string will be stored in heap area b'coz
        // inbuilt method is used
        // String s3 = new String("pwskill"); // string will be stored in heap area
        // b'coz new keywod is used
        // s3 = s3.concat("skill"); // string will be concatenated b'coz it is outside
        // the SCP
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // String s1 = new String("pw");

        // s1.concat("skill"); // string will not be concatenated
        // s1 = s1.concat("skill");
        // System.out.println(s1);

    }
}
