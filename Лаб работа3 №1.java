import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = 0;
            System.out.println("Введите размерность массива: ");

            while(!sc.hasNextInt()){
                System.out.print("Введено не целое число, введите заново ");
                sc.next();
            }
             size = sc.nextInt();
            if (size>=0) {
            }
            else {
                System.out.println("Размерность не может быть равна 0 или быть отрицательной.");
                return;
            }
           double array[] = new double[size];
            System.out.println("Введите элементы массива:");

            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            System.out.print ("Массив:");
            for (int i = 0; i < size; i++) {
                System.out.print (" " + array[i]);
            }
            System.out.println();
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                array[i] = sum / (i + 1);
            }
            System.out.print ("Массив после обработки:");
                for (int i = 0; i < size; i++) {
                    System.out.print (" " + array[i]);
                }
            }
        }


