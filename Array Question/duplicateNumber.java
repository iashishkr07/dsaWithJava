public class duplicateNumber {
    int[] arr=null;
    public duplicateNumber(int size){
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
    
    public static int[] removeDuplicate(int[] array){
        int n=array.length;
        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<array.length-1;i++){
            if(array[i]!=array[i+1]){
                temp[j++]=array[i];
            }
        }
        temp[j++]=array[n-1];
        int[] result=new int[j];
        System.arraycopy(temp,0,result,0,j);
        return result;
    }
    public static void main(String[] args) {
        duplicateNumber ar=new duplicateNumber(10);
        ar.insert(0, 1);
        ar.insert(1, 2);
        ar.insert(2, 3);
        ar.insert(3, 4);
        ar.insert(4, 6);
        ar.insert(5, 7);
        ar.insert(6, 8);
        ar.insert(7, 9);
        ar.insert(8, 9);
        ar.insert(9, 11);

        ar.printArray();
        System.out.println();
        int[] temp=removeDuplicate(ar.arr);
        System.out.println("After removing duplicates");
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
    
}