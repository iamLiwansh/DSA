public class fact {
    //iterative
    public static int factItra(int n){
        int total = 1;
        for(int i = n ; i>0 ; i--){
            total = total * i;
        }
        return total;
    }
    public static void main (String[] args){
        int n = 5;
        System.out.println(factItra(n));
    }
}
