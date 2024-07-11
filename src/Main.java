//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int askValue = 0;
        int askValue2 = 0;
        int times = 0;
        int min = 0;
        int max = 0;
        boolean YorN = true;
        int[] dataPoints = new int[100];
        for(int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        for(int y = 0; y < dataPoints.length; y++) {
            System.out.print(dataPoints[y] + " | ");
        }
        for(int z = 0; z < dataPoints.length; z++) {
            sum = sum + dataPoints[z];
        }
        average = sum / dataPoints.length;
        askValue = SafeInputLibrary.getRangedInt(in, "Enter a number from 1 to 100", 1, 100);
        for(int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == askValue) {
                times = times + 1;
            }
        }
        System.out.println("Your input, " + askValue + ", matched " + times + " values in the array dataPoints");
        askValue2 = SafeInputLibrary.getRangedInt(in, "Enter a number from 1 to 100", 1, 100);
        for(int j = 0; j < dataPoints.length; j++) {
            if (dataPoints[j] == askValue2) {
                System.out.println("The first position where your input, " + askValue2 + ", matched a value in dataPoints was " + (j+1));
                YorN = false;
                break;
            }
        }
        if (YorN) {
            System.out.println("No values matched your input in dataPoints");
        }
        max = dataPoints[1];
        for(int big = 0; big < dataPoints.length; big++) {
            if(dataPoints[big] > max) {
                max = dataPoints[big];
            }
        }
        min = dataPoints[1];
        for(int sml = 0; sml < dataPoints.length; sml++) {
            if(dataPoints[sml] < min) {
                min = dataPoints[sml];
            }
        }
        System.out.println("The max is " + max);
        System.out.println("The min is " + min);
        System.out.println("The average of dataPoints is " + getAverage(dataPoints));
    }
    public static double getAverage (int values[]) {
        double average = 0;
        double sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        average = sum / values.length;
        return average;
    }
}