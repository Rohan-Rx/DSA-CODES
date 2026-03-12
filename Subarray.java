import java.util.*;
class SubArray{
    public static void main(String[] arg){
        int arr[];
        int s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of arrar:");
        s=sc.nextInt();
        arr=new int[s];
        System.out.println("Enter the array elements:");
        for(int i=0; i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sub Array are: ");
        int max=arr[0];

        for(int sum=0; sum<arr.length; sum++){
            for(int j=sum; j<arr.length;j++){
                sum=sum+arr[j];
                System.out.print("Sum: "+sum);
                if(max<sum){
                    max=sum;
                }
                
                
                for(int k=sum; k<=j;k++){
                   // System.out.print("["+arr[k]+"]");
                }
                System.out.println();
            }
        }
        System.out.println("MAX:"+max);
    }
}