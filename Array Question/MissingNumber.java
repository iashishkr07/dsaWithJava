public class MissingNumber{
    int[] arr=null;
    public MissingNumber(int size){
    arr=new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i]=Integer.MIN_VALUE;
    }
}
    public void insert(int index, int value){
        try {
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
                System.out.println("The value is inserted successfully at index: "+index);
            }else{
                System.out.println("The Value is already inserted at index: "+index);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
    public void printArray(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int findMissingNumberInArray(int[] array) {
        int n = array.length;
    int actualsum = 0;
    int sum = 0;
    
    for (int i=0;i<n;i++) {
        sum+=array[i];
    }
    for(int i=1;i<=n+1;i++){
        actualsum+=i;
    }
    int missingNumber = actualsum-sum;
    return missingNumber;
    }
    
    public static void main(String[] args) {
        MissingNumber ar=new MissingNumber(10);
        ar.insert(0, 1);
        ar.insert(1, 2);
        ar.insert(2, 3);
        ar.insert(3, 4);
        ar.insert(4, 6);
        ar.insert(5, 7);
        ar.insert(6, 8);
        ar.insert(7, 9);
        ar.insert(8, 10);
        ar.insert(9, 11);

        ar.printArray();
        System.out.println();
        System.out.println( findMissingNumberInArray(ar.arr));
    }
    
}