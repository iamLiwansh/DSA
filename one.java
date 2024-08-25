class one {
    public static int partition(int arr[] , int low , int high){
        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i<j ){
            while(arr[i]<= pivot && i<= high-1 ){
                i++;
            }
            while(arr[j]> pivot && j>= low +1 ){
                j--;
            }
            if(i<j){
                int temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
       
 }
    
    public static void QS(int arr[] , int low , int high){
        if(low<high){
            int pivot = partition(arr,  low , high);
            
            QS(arr , low , pivot -1);
            QS(arr , pivot+1 , high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length-1;
        System.out.println("fh");
        QS(arr, 0, n);

        //print
        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i] + "");
        }

    }
}