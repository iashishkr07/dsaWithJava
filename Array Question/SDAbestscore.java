public class SDAbestscore {
    int [] arr=null;
    public SDAbestscore(int size){
        arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int index, int value){
        try {
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
                System.out.println("The value is successfully inserted at index " + index);
            }
            else{
                System.out.println("The Value is Already in the array at index " + index);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
    public void printArray(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] bestscore(int [] array){
        int[] max=new int[2];
        max[0]=Integer.MIN_VALUE;
        max[1]=Integer.MIN_VALUE;
        for(int i=0; i<array.length;i++){
            if(array[i]>max[0]){
                max[1]=max[0];
                max[0]=array[i];
            }
            else if(array[i]>max[1] && array[i]<max[0]){
                max[1]=array[i];
            }
        }
        return max;  
    }
    public static void main(String[] args) {
        SDAbestscore sda=new SDAbestscore(6);
        sda.insert(0, 84);
        sda.insert(1,85);
        sda.insert(2,86);
        sda.insert(3,87);
        sda.insert(4,85);
        sda.insert(5,90);
        sda.printArray();
        System.out.println("\nBest Score Of Array:");
        int [] max=bestscore(sda.arr);
        for(int i=0;i<max.length;i++){
            System.out.print(max[i]+" ");
        }
    }
    
}