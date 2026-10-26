
package bubblesortexample;
import java.util.Random;
public class BubbleSortExample {


public static void bubbleSort(int[] data) {
    int n = data.length;
    if (n < 2) return;    

    boolean swapped = true;
    for (int i = 0; swapped && i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - 1; j++) {
            if (data[j] > data[j + 1]) {
                int temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;
                swapped = true;
            }
        }
    }
}

public static void main(String[] args) {
    int size = 5000; 
    int[] originalArray = new int[size];
    Random rand = new Random();

   
    for (int i = 0; i < size; i++) {
        originalArray[i] = rand.nextInt(5000);
    }

    int[] randomArray = originalArray.clone();
    
    long startTimeRandom = System.nanoTime(); 
    bubbleSort(randomArray); 
    long endTimeRandom = System.nanoTime();   
    
    long durationRandom = endTimeRandom - startTimeRandom;
    System.out.println("Time to sort pre-sorted array   : " + durationRandom + " nanosecound ");
}
}