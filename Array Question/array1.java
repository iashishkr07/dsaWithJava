public class array1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] res= calSumAndProduct(arr);
        System.out.println("Sum:"+res[0]);
        System.out.println("Product:"+res[1]);
    }
    public static int[] calSumAndProduct(int[] arr){
        int sum=0;
        int product=1;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            product*=arr[i];            
        }
        return new int[]{sum,product};
    }
}
