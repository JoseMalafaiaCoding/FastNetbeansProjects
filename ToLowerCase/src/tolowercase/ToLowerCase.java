package tolowercase;

public class ToLowerCase {

    public static void main(String[] args)throws java.io.IOException {
        System.out.println("Digite uma letra maiúscula:");
        char letra = (char) System.in.read();
        if( ((int) letra) > 96 || ((int) letra) < 65){
            System.out.println(letra + " Não é uma letra maiúscula");
        }else{
            System.out.println((char)(letra | 32));
        }
    }
}
