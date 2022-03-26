package DopTest;
import java.util.Scanner;
public class DopTest {
    public static void DopTest() {
        /**Реализовать функцию перемешивания массива целых чисел (кол-во элементов > 100)
         *  блоками по K элементов N раз.
         */
        System.out.println("Dop Test");
        int K, N;
        System.out.println("Enter K: ");
        K = new Scanner(System.in).nextInt();
        System.out.println("Enter N: ");
        N = new Scanner(System.in).nextInt();
        if (N <= 100) { //проверка условия;
            System.out.println("Размер должен быть > 100");
        } else {

            int array[];
            array = new int[N];                   // Наш массив из N чисел;
            System.out.println("Ваш массив: ");
            for (int i = 0; i < N; i++) {         //заполняю массив случайными числами;
                array[i] = ((int) (Math.random() * 100));
                System.out.print(array[i]);       //Вывожу поэлементно;
                System.out.print(" ");
            }
            System.out.println("\nПеремешанный маччив: ");
            int temp;                             //переменная для обмена элементами;
            for (int i = 0; i < N/2; i++) {       //меняем элементы местами;
                temp = array[N - i - 1];          //записываем элементы справа на лево;
                array[N - i - 1] = array[i];      //записываем в массив;
                array[i] = temp;
            }
            for (int i = 0; i < array.length; i++) { //вывод конечного массива;
                System.out.print(array[i]);
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        DopTest();
    }
}