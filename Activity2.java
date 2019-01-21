  
package activity2;

import java.util.Scanner;

public class Activity2 {


    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int sum = 0;
        float average;
        
        Scanner reader = new Scanner (System.in);
        
        
        do {
            System.out.println("How many numbers do you want to input?");
            while(!reader.hasNextInt()){
                System.out.println("enter valid number:");
                reader.next();
            }
            n=reader.nextInt();
        }while (n<=0);
            
        int a[] = new int [n];
        for (int i= 0 ; i < n; i++) {
            reader = new Scanner(System.in);
            try{
                System.out.println("Enter Number:");
           a[i] = reader.nextInt();
           sum = sum +a[i];
        }catch (Exception e) {
            System.out.println("INVALID INPUT");
            i--;
        }
        }
        System.out.println("Mean:" +getMean(a));
    }            
    
    public static float getMean(int[]arr){
        float sum=0;
                
        for (int i=0; i<arr.length; i++ )
        {
            sum +=arr[i]; 
        }
        return (float) (sum / arr.length);
    }
    
    public static void getMedian(float[]m){
        

    }
    
}
