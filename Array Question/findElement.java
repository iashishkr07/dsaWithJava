import java.util.Arrays;

public class findElement{
    int arr[][]=null;
    public findElement(int NumOfRow, int NumOfCol){
        this.arr=new int[NumOfRow][NumOfCol];
        for(int row=0; row<arr.length;row++){
            for(int col=0; col<arr[0].length; col++){
                arr[row][col]=Integer.MIN_VALUE;
            }
        }
    }
    
    public void insert(int row, int col, int value){
        try{
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=value;
                System.out.println("The value is successfully inserted");
            }
            else{
                System.out.println("The value is already inserted in this position");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invailed index for 2D Array");
        }
    }
    
    public void FindArrayElement(int row, int col){
        System.out.println("Accessing the Two DArray Row#"+row+"Col#"+col);
        try {
            System.out.println("Index value is"+arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invailed index for 2D Array");
        }
    }
    
    public void traverseArray(){
        for(int row=0;row<arr.length;row++){
            for(int col=0; col<arr[0].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    
        public static void main(String[] args) {
        findElement array=new findElement(3,3);
        array.insert(0,0,1);
        array.insert(0,1,2);
        array.insert(0,2,3);
        array.insert(1,0,4);
        array.insert(1,1,5);
        array.insert(1,2,6);
        array.insert(2,0,7);
        array.insert(2,1,8);
        array.insert(2,2,9);

        
        System.out.println(Arrays.deepToString(array.arr));
        
        array.FindArrayElement(1,1);
        array.traverseArray();
        

    }
}
