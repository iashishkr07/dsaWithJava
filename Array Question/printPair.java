public class printPair {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printpairs(arr);
    }
    public static void printpairs(int[] arr){
        for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr.length; j++){
                    System.out.print( arr[i] + "" + arr[j] );
                    System.out.print(" "); 
                }
                System.out.println();
            }
        
    }
}
