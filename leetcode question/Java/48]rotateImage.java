import java.util.Arrays;
public class matrix {
    public static void main(String[] arg){
        matrix a = new matrix();
        int[][] arr=new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        int[][] res=a.rotateMatrix(arr);
        System.out.println(Arrays.deepToString(res));
    }
    public  int[][]rotateMatrix(int[][] matrix){
        int n=matrix.length;
        int[][] result= new int[n][n];
        for(int i=0; i<matrix.length; i++){
            for(int j=0;j<matrix.length;j++){
                result[j][n-i-1]=matrix[i][j];
            }
        }
        return result;
    }
}
