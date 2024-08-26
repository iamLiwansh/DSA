public class reverse {
    public static void revanArray(int arr[]){
        int n = arr.length;
        
        for(int i = 0 ; i < n/2 ; i++){
            for( int j = n - 1 - i; j > i; j--){
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        

        revanArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
