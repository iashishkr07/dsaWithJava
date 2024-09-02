

public class containsDuplicate {
    int [] arr=null;
    public containsDuplicate(int size){
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
    public boolean isUnique(int[] array){
        int n=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    n++;
                    break;
                }
            }
        }
        if(n==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        containsDuplicate cd= new containsDuplicate(5);
        cd.insert(0, 10);
        cd.insert(1, 20);
        cd.insert(2, 30);
        cd.insert(3, 40);
        cd.insert(4, 50);
        boolean res=cd.isUnique(cd.arr);
        System.out.println(res);
    }
}
