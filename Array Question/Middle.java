public class Middle {
    int[] arr=null;
    public Middle(int size){
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
    public static int[] middleFunction(int[] array){
        int n=array.length;
        int[] middle=new int[n-2];
        for(int i=1;i<n-1;i++){
            middle[i-1]=array[i];
        }
        return middle;
    }
    public static void main(String[] args) {
        Middle ar=new Middle(5);
        ar.insert(0, 10);
        ar.insert(1, 20);
        ar.insert(2, 30);
        ar.insert(3, 40);
        ar.insert(4, 50);
        ar.printArray();
        System.out.println();
        System.out.println("Only Array middle value :");
        int[] middle=middleFunction(ar.arr);
        for(int i=0; i<middle.length;i++){
            System.out.print(middle[i]+" ");
        }
    }   
}
