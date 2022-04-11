package numcomp;

public class NumComp {

    public static void main(String[] args) {
        byte binNum = 73;
        for(int i = 128; i > 0; i = i / 2){
            if((binNum & i) != 0){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
        System.out.println();
        for(int i = 128; i > 0; i = i / 2){
            if((~binNum & i) != 0){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
        System.out.println();
    }
}
