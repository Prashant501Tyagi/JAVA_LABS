import java.util.Scanner;

public class lab5 {

    static char[] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T',
            'U', 'V', 'W', 'X', 'Y', 'Z' };
    static char[] arr1 = { 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
            'P',
            'Q',
            'R', 'S', 'T', 'U', 'V', 'W' };

    static char encode(char text, char[] arr, char[] arr1) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == text) {
                return arr1[i];

            }
        }
        return ' ';

    }

    static char decode(char text, char[] arr, char[] arr1) {

        for (int i = 0; i < arr.length; i++) {
            if (arr1[i] == text) {
                return arr[i];

            }
        }
        return ' ';

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean exit = true;

        do {

            System.out.println("##menu##############");
            System.out.println("##1. encode text##");
            System.out.println("##2. deocde texte##");
            System.out.println("### 3 .exit");
            System.out.println("####################");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the text to encode it : ");
                    String text = sc.nextLine();

                    for (int i = 0; i < text.length(); i++) {
                        System.out.print(encode(text.charAt(i), arr, arr1));

                    }
                    System.out.println();

                    break;

                case 2:
                    System.out.println("Enter the text to decode it : ");
                    String textt = sc.nextLine();
                    for (int i = 0; i < textt.length(); i++) {
                        System.out.print(decode(textt.charAt(i), arr, arr1));

                    }
                    System.out.println();
                    break;
                case 3:
                    exit = false;
            }

        } while (exit);
    }

}