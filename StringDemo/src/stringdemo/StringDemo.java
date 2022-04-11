
package stringdemo;


public class StringDemo {

    public static void main(String[] args) {
        String str = new String("Hello");
        String str2 = new String(str);
        String str3 = "Hello";
        System.out.println(str.equals(str2));
    }
    
}
