import java.util.Arrays;
import java.util.Random;
 
public class Program2 {
 
public static void main(String[] args) {
int[] list = new int[10];
 
// Fill array with numbers
for (int i = 0; i < list.length; i++) {
Random random = new Random();
list[i] = random.nextInt((20 - 1) + 1) + 1;

}
 
System.out.println("Original: \n" + Arrays.toString(list).replace("[", "").replace("]", "").replace(",", "") + "\n");
 
for (int j = 0; j < list.length; j++) {
for (int i = 0; i < list.length; i = i + 1) { if (i != list.length - 1) { if (list[i] > list[i + 1]) {
int temp = list[i];
list[i] = list[i + 1];
list[i + 1] = temp;
}
}
}

System.out.println("==> " + Arrays.toString(list).replace("[", "").replace("]", "").replace(",", ""));
}
System.out.println("\nSorted: \n" + Arrays.toString(list).replace("[", "").replace("]", "").replace(",", ""));
}
}