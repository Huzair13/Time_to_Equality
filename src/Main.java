import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array !!");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements !!!");
        int array[]=new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }

        //max value
        int max=FindMaximum(array,size);

        //minimum time
        int time=FindTime(array,size,max);

        System.out.println(time);

    }

    private static int FindTime(int[] array, int size, int max) {
        int time=0;
        for(int element :array){
            time+=(max-element);
        }
        return time;
    }

    private static int FindMaximum(int[] array, int size) {
        int max= Integer.MIN_VALUE;
        for(int iterator=0;iterator<size;iterator++){
            if(max<array[iterator]){
                max=array[iterator];
            }
        }
        return max;
    }
}