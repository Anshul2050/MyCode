package arrays;

public class BasicArray {

	public static void main(String[] args) {

        int[] num1 = new int[10];
        int[] num2 = new int[20];
        int[] num3 = new int[]{1, 210, 3, 240}; // array initialiser

        for (int i = 0; i < num3.length; i++) {
            System.out.print(num3[i] + " ");
        }
        System.out.println("===================================");
        int[] num4 = new int[10]; // array initialiser

        for (int i = 0; i < num4.length; i++) {
            System.out.print(num4[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < num4.length; i++) {
            num4[i] = i + 1; // assigning normal values

            System.out.print(num4[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < num4.length; i++) {
            num4[i] = num4.length - i; // assigning reverse values

            System.out.print(num4[i] + " ");
        }
        int[] num5 = new int[10];
        System.out.println();
        for (int element : num5) {
            System.out.print(element + " ");
        }

    }

}
