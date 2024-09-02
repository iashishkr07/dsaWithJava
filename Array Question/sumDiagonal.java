public class sumDiagonal {
    int arr[][]=null;
    public sumDiagonal(int NoOfRow, int NoOfCol){
        this.arr=new int[NoOfRow][NoOfCol];
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[0].length; col++){
                arr[row][col]=Integer.MIN_VALUE;
            }
        }
    }
    public void insert(int row, int col, int value){
        try {
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=value;
                System.out.println("Value inserted successfully at row: "+row+", col: "+col);
            }
            else{
                System.out.println("Value already exists at row: "+row+", col: "+col);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invailed index for row: "+row+", col: "+col);
        }
    }
    public static int sumDiagonalElement(int[][] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
                    sum+=array[i][i];
                }
        return sum;
    }
    public static void main(String[] args) {
        sumDiagonal twoDArray=new sumDiagonal(3,3);
        twoDArray.insert(0,0,1);
        twoDArray.insert(0,1,2);
        twoDArray.insert(0,2,3);
        twoDArray.insert(1,0,4);
        twoDArray.insert(1,1,5);
        twoDArray.insert(1,2,6);
        twoDArray.insert(2,0,7);
        twoDArray.insert(2,1,8);
        twoDArray.insert(2,2,9);
        System.out.println("Sum of diagonal elements: "+sumDiagonalElement(twoDArray.arr));
    }
}
