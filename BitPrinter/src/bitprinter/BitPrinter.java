
package bitprinter;


public class BitPrinter {


    public static void main(String[] args) {
        byte bitNum = 89;
        for(int i = 128; i > 0; i = i / 2){
            if((i & bitNum) != 0){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
        System.out.println();
    }
    
}
