import java.util.*;
public class searchValue {
    int arr[][]=null;
    public searchValue(int NumOfRow, int NumOfCol){
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
    public void searchArrayValue(int value){
        for(int row=0; row<arr.length;row++){
            for(int col=0; col<arr[0].length;col++){
                if(arr[row][col]==value){
                    System.out.println("The Value "+value+"is found successfully at row:"+row+"col:"+col);
                return;
                }
            }    
        }
        System.out.println("The Value "+value+" is not found in the 2D Array");
    }
    public static void main(String[] args) {
        searchValue ar=new searchValue(3, 3);
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
        ar.searchArrayValue(23);
    }

}
