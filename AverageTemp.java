
import java.util.Scanner;

public class AverageTemp {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);

        // ASK for  Number of Days  
        System.out.println("How many day's temperatures?");
int numDays = scnr.nextInt();


int [] temps = new int [numDays];
//RECOND TEMP and FIND AVERAGE
int sum =0;
for (int i =1; i<=numDays;i++){
System.out.println("Day "+ i +"'s high temp: ");
temps[i] = scnr.nextInt();
sum += temps[i];
}
double average = sum/numDays;
int above = 0;
for (int i=0;i<=temps.length;i++){
if (temps[i]> average){
above ++;
}
}
System.out.println();
System.out.println("Average Temp="+ average);
System.out.println(above+"days above average");


        scnr.close();
    }
}
