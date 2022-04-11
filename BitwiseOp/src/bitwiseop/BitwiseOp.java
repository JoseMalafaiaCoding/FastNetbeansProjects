
package bitwiseop;


public class BitwiseOp {


    public static void main(String[] args)throws java.io.IOException {
        System.out.println("Digite uma letra:");
        char ch = (char) System.in.read();
        if(ch < 97 || ch > 122){
            System.out.println(ch + " não é uma letra minúscula");
        }else{
            System.out.println((char) (ch & 0b1011111));
        }
    }
    
}
