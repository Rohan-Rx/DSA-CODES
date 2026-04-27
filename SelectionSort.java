class SelectionSort{
    public void sort(int[] a){
        int n= a.length;
        int temp=0;
        int min;

        for(int i=0; i<n; i++){
            min=i;
            for(int j=i+1; j<n; j++){

                if(a[j] < a[min]){                  //Searches the Minimum Element
                    min=j;
                }
            }
            temp=a[i];                                  //Swaps the min element 
            a[i]=a[min];
            a[min]=temp;
            
        }
    }
    public void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] arr= {10,15,4,6,32,40};
        SelectionSort s= new SelectionSort();

        s.sort(arr);
        s.print(arr);
    }
}