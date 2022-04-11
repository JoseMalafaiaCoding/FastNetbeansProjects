package encoder;

public class Encoder {

    public static void main(String[] args) {
        String msg = "Oi, tudo bem?";
        String chave = "password";
        String encmsg = "";
        char codLetter;
        String decmsg = "";
        for(int i = 0; i < msg.length(); i++){
            codLetter = msg.charAt(i);
            for(int j = 0; j < chave.length(); j++){
                codLetter = (char) (codLetter ^ chave.charAt(j));
            }
            encmsg = encmsg + codLetter;
        }
        System.out.println("Mensagem criptografada: " + encmsg);
        char decodLetter;
        for(int i = 0; i < encmsg.length(); i++){
            decodLetter = encmsg.charAt(i);
            for (int j = chave.length() - 1; j >= 0; j--) {
                decodLetter = (char) (decodLetter ^ chave.charAt(j));
            }
            decmsg = decmsg + decodLetter;
        }
        System.out.println("Mensagem decroptografada: " + decmsg);
    }
}
