public class permutation {
    public static void main(String[] args) {
        permutation is=new permutation();
        int[] Array={1,2,3,4,5,6};
        int[] Array1={6,5,1,2,3,4};
        boolean res=is.Permutation(Array,Array1);
        System.out.println(res);
    }
    public boolean Permutation(int[] Array,int[] Array1) {
        if(Array.length!=Array1.length){
            return false;
        }
        int sum=0;
        int sum1=0;
        int mul=1;
        int mul1=1;
        for(int i=0;i<Array.length;i++){
            sum+=Array[i];
            mul*=Array[i];
            sum1+=Array1[i];
            mul1*=Array1[i];
        }
        if(sum==sum1 && mul==mul1){
            return true;
        }
        return false;
    }
}
