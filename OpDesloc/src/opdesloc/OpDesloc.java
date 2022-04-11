
package opdesloc;


public class OpDesloc {

    public static void main(String[] args) {
        int val = 1;
        int deslocEsq [][] = new int[8][8];
        for(int j = 0; j < 8; j++){
            for(int i = 128, count = 0; i > 0; i /= 2, count++){       
                if((val & i) != 0){
                    deslocEsq[j][count] = 1;
                }else{
                    deslocEsq[j][count] = 0;
                }
            }
            val = val << 1;
        }
        val = val >> 1;
        for(int []x : deslocEsq){
            for(int y : x){
                System.out.print(y);
            }
            System.out.println();
        }
        System.out.println();
        int deslocDir[][] = new int[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 128, count = 0; j > 0; j /= 2, count++){
                if((val & j) != 0){
                    deslocDir[i][count] = 1;
                }else{
                    deslocDir[i][count] = 0;
                }
            }
            val = val >> 1;
        }
        for(int []x : deslocDir){
            for(int y : x){
                System.out.print(y);
            }
            System.out.println("");
        }
    }
}
