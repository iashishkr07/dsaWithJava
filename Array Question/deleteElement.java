public class deleteElement {
    public static void main(String[] args) {
        deleteElement ar=new deleteElement(5); 
        ar.insert(0, 45);
        ar.insert(1, 10);
        ar.insert(2, 20);
        ar.insert(3, 30);
        ar.insert(4, 70); 

        ar.deleteValue(0);
        var FirstElement =ar.arr[0];
        System.out.println(FirstElement);
        ar.Traverse();
        
    }
    int[] arr=null;
    public deleteElement(int size){
        arr=new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int index, int value){
    try{
        if(arr[index]==Integer.MIN_VALUE){
            arr[index]=value;
            System.out.println("Element inserted successfully at index: "+index);
        }else{
            System.out.println("Element is already inserted in this index:"+index);
        }
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index out of bounds");
    }
    }
    public void deleteValue(int indexNo){
    arr[indexNo] =Integer.MIN_VALUE;
    System.out.println("The value has been deleted Successfully");
    }
    public void Traverse(){
        int n=arr.length;
        int[] middle=new int[n-2];
        for(int i=1; i<arr.length; i++){
            middle[i]=arr[i];
            System.out.print(middle[i]+" ");
    }
}
}
