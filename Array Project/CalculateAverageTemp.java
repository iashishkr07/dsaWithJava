import java.util.Scanner;
public class CalculateAverageTemp {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("How many days temperatures?");
        int numdays=sc.nextInt();
        int[] temps= new int[numdays];
        int sum=0;
        for (int i=0;i<=numdays-1;i++){
            System.out.print("Day"+(i+1)+"'s high temp:");
            temps[i]=sc.nextInt();
            sum+=temps[i];
        }
        double average= sum/numdays;
        int above=0;
        for(int i=0;i<numdays-1;i++)
        {
            if(temps[i]<average){
                above++;
            }
        }
        System.out.println("Average Temp="+average);
        System.out.println(above+"days above average");
    }
}