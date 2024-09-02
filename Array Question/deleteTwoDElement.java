import java.util.*;
public class deleteTwoDElement {
    int arr[][]=null;
    public deleteTwoDElement(int NumOfRow, int NumOfCol){
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
    public void deleteArrayElement(int row, int col){
        try {
        System.out.println("Successfully deleted:"+arr[row][col]);
        arr[row][col] =Integer.MIN_VALUE;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This Index is not vaild for array");
        }
    }
    public static void main(String[] args) {
        deleteTwoDElement ar=new deleteTwoDElement(3, 3);
        ar.insert(0,0,1);
        ar.insert(0,1,2);
        ar.insert(0,2,3);
        ar.insert(1,0,4);
        ar.insert(1,1,5);
        ar.insert(1,2,6);
        ar.insert(2,0,7);
        ar.insert(2,1,8);
        ar.insert(2,2,9);

        System.out.println(Arrays.deepToString(ar.arr));
        ar.deleteArrayElement(0,2);
    }
}
