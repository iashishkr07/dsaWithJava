public class twoSum {
    int [] arr=null;
    public twoSum(int size){
        arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int index,int value ){
        try{
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
                System.out.println("The value is inserted at index"+index);
            }
            else{
                System.out.println("The value is already in the array at index"+index);
            }
        }
        catch(ArrayIndexOutOfBoundsException w){
            System.out.println("Array index out of bounds");
        }
    }
    public void printArray(){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] twosum(int[] array){
        int[] result=new int[2];
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]+array[j]==9){
                    result[0]=i;
                    result[1]=j;
                
                
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        twoSum ts=new twoSum(4);
        ts.insert(0, 2);
        ts.insert(1, 8);
        ts.insert(2, 7);
        ts.insert(3, 15);
        ts.printArray();
        int[] res=twosum(ts.arr);
        System.out.println();
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
