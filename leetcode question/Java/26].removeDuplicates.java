public class removeDuplicates {
    int [] arr=null;
    public removeDuplicates(int size){
        arr =new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int index,int value){
        try {
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
                System.out.println("The Value is Inserted successfully! at index"+index);
            }
            else{
                System.out.println("The Value is already inserted at index"+index);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of bounds");
        }
    }
    public void printArray(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeDuplicate(int [] array){
        int n=array.length;
        int count=n;
        if(n==0){
            return 0;
        }
        else{
            for(int i=0;i<array.length;i++){
                for(int j=i+1;j<array.length;j++){
                    if(array[i]==array[j]){
                        count--;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        removeDuplicates rm=new removeDuplicates(5);
        rm.insert(0, 5);
        rm.insert(1, 5);
        rm.insert(2, 10);
        rm.insert(3, 15);
        rm.insert(4, 15);
        rm.printArray();
        System.out.println();
        int res = removeDuplicate(rm.arr);
        System.out.println(res);
    }    
}

