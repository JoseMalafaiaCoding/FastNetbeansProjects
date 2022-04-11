
package bintodec;


public class BinToDec {

    public static void main(String[] args) {
        byte binNum = 0b1101101;
        int soma = 0;
        for(int i = 1; i < 128; i = i * 2){
            if((binNum & i) != 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
