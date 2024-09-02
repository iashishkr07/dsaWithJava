public class findingNumber {
    int [] arr=null;
    public findingNumber(int size){
        arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int index,int value){
        try{
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
                System.out.println("The value is inserted at index"+index);
            }
            else{
                System.out.println("The value is already in the array at index"+index);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
    }
    public void printArary(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void searchInArray(int[] array, int valueToSearch) {
        for(int i=0;i<array.length;i++){
            if(valueToSearch==array[i]){
                System.out.println("The value "+valueToSearch+" is found at index: "+i);
                return;
            }
        }
        System.out.println("The value "+valueToSearch+" is not found in the array");
    }

    public static void main(String[] args) {
        findingNumber fn = new findingNumber(6);
        fn.insert(0, 1);
        fn.insert(1, 2);
        fn.insert(2, 30);
        fn.insert(3, 4);
        fn.insert(4, 5);
        fn.insert(5, 6);
        fn.printArary();
        System.out.println();
        fn.searchInArray(fn.arr, 30);
        fn.searchInArray(fn.arr, 8);
        
    }
}
