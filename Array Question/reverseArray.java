public class reverseArray {
    public static void reversearray(int [] arr)
    {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        reversearray(arr);
        for(int i=arr.length; i>0;i--){
            System.out.print(i+" ");
        }
    }
}
