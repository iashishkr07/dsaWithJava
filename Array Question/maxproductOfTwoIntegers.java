public class maxProductOfTwoIntegers {
    int [] arr=null;
    public maxProductOfTwoIntegers(int size){
        arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int index, int value){
        try{
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
                System.out.println("The valuen is inserted at index "+index);
            }
            else{
                System.out.println("The value is already in the array at index "+index);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
    }
    public void printArray(){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public String maxProduct(int[] intArray) {
        int n = intArray.length;
        int max = Integer.MIN_VALUE;
        String output="";
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                
                if( intArray[i]*intArray[j]>max){
                    max=  intArray[i]*intArray[j];
                    output = Integer.toString(intArray[i])+","+Integer.toString(intArray[j]);
                }
            }
        }
        return output;
    }
    public static void main(String agr[]){
        maxProductOfTwoIntegers ar=new maxProductOfTwoIntegers(5);
        ar.insert(0, 1);
        ar.insert(1, 2);
        ar.insert(2, 3);
        ar.insert(3, 4);
        ar.insert(4,5 );
        ar.printArray();
        
        System.out.println();
        System.out.println("The two integers with maximum product are: "+ar.maxProduct(ar.arr));
        
    }
}
