public class LinearSearch{
    public static void main(String[] args) {
        int arr[] = {5, 4 ,3, 2, 1};
        int num = 5;

        for(int i = 0 ; i < arr.length ; i++){
            
                if(arr[i] == num){
                    System.err.println("number is on : " + (i+1));
                    break;
                }
            
        }
    }
}