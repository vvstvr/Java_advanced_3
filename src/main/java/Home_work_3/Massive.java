package Home_work_3;

/**
 * * Массив размерностью 20
* Он заполняется случайными целыми числами от -10 до 10
* Нужно найти максимальный отрицательный и минимальный положительный элементы массива
* Поменять их местами.
 */

import java.util.Random;

public class Massive {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Массив из 20 случайных целых чисел от -10 до 10: ");

        //Генерация рандома чисел
        int[] randArr = new int[20];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = rand.nextInt(21)-10;
            System.out.println(i+": "+ randArr[i]);
        }

        //Поиск максимальнго отрицательного
        int MaxOtr=-10;
        for (int i = 0; i < randArr.length-1; i++) {
            if ((randArr[i]<0) && (randArr[i]>MaxOtr)) {
                MaxOtr = randArr[i];
                if (randArr[i+1]<0) {
                    if (MaxOtr > randArr[i+1]) {
                        MaxOtr = randArr[i];
                    }
                    else MaxOtr = randArr[i+1];
                }
            }
        }
        System.out.println("\n Максимальное отрицательное число: " + MaxOtr);

        //Поиск минимального положительного
        int MinPol=10;
        for (int i = 0; i < randArr.length-1; i++) {
            if ((randArr[i]>0) && (randArr[i]<MinPol)) {
                MinPol = randArr[i];
                if (randArr[i+1]>0) {
                    if (MinPol < randArr[i+1]) {
                        MinPol = randArr[i];
                    }
                    else MinPol = randArr[i+1];
                }
            }
        }
        System.out.println("\n Минимальное положительное число: " + MinPol);

        //Замена мест максимального отрицательного и минимального положительного
        System.out.println("\n Массив после замены минимальных положительных на максимальные отрицательные и наоборот: ");
        for (int i = 0; i < randArr.length; i++) {
            if (randArr[i]==MinPol) {
                randArr[i]=MaxOtr;
            }
            else if (randArr[i]==MaxOtr) {
                randArr[i]=MinPol;
            }
            System.out.println(i +": "+randArr[i]);
        }
    }
}
