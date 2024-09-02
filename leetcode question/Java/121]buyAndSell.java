public class buyAndSell {
    int [] arr=null;
    public buyAndSell(int size){
        arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int index,int value){
        try {
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
                System.out.println("The value is inserted at index"+index);
            }
            else{
                System.out.println("The value is already inserted at index"+index);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
    public void printArray(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int maxProfit(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<prices.length; i++){
            minPrice=Math.min(minPrice, prices[i]);
            maxProfit=Math.max(maxProfit, prices[i]-minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        buyAndSell bs=new buyAndSell(6);
        bs.insert(0, 7);
        bs.insert(1, 1);
        bs.insert(2, 5);
        bs.insert(3, 3);
        bs.insert(4, 6);
        bs.insert(5,4);
        bs.printArray();
        System.out.println();
        int res=maxProfit(bs.arr);
        System.out.println("Max Profit value is:"+res);
    }
}
