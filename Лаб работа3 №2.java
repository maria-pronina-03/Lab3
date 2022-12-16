import java.util.Scanner;;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int tmp=0;

        System.out.println("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Введено не целое число, введите заново ");
            sc.next();
        }
        size = sc.nextInt();
        if (size >= 0) {
        } else {
            System.out.println("Размерность не может быть равна 0 или быть отрицательной.");
            return;
        }
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();


        System.out.println("Введите элемент, который нужно удалить из массива:");
        int X = sc.nextInt();
        System.out.print("Массив:");

        int newArray[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != X) {
                   newArray[tmp]= array[i];
                    tmp++;
                }
            }
        for (int i = 0; i < tmp; i++) {
                System.out.print(" " + newArray[i]);
            }
        }
    }




