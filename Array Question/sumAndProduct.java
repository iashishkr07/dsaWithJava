import java.util.Scanner;

public class sumAndProduct {
     
    public static void main(String[] args) {
        int n;
        int[] arr;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array:");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter element of array:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] res= calSumAndProduct(arr);
        System.out.println("sum:"+res[0]);
        System.out.println("Product:"+res[1]);
    }
    public static int[] calSumAndProduct(int[] arr){
        int sum =0;
        int product =1;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            product*=arr[i];
        }
        return new int[]{sum,product};
    }  
}
