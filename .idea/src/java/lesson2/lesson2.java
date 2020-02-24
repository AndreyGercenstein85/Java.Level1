package geekbrains.lesson2;

public class Main {

    static void printArray(int arr[]){
        //System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void printArrayMatrix(int arr[][]){
        //System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    static void printFullInfoWithDelimiter(int arr[], int d, int sumL, int sumR){
        System.out.println(sumL + " == " + sumR);
        for (int i = 0; i < arr.length ; i++) {
            if (i == d) System.out.print("|| ");
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static boolean checkBalance(int arr[]){

        if (arr.length < 2) return  false; //проверим, что в массиве больше 1 элемента
        for (int i = 0; i < arr.length - 1; i++) {
            int sumL = 0;
            for (int j = 0; j <= i ; j++) {
                sumL += arr[j];
            }
            int sumR = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sumR += arr[j];
            }
            if (sumL == sumR) {

                printFullInfoWithDelimiter(arr,i+1, sumL, sumR);
                return true;
            }
        } return false;
    }

    static void shiftElements(int arr[], int pos){
        System.out.println(String.format("\n%40s", "").replace(' ','-'));
        System.out.println("\nBefore: ");
        System.out.println("pos = " + pos );
        for (int i : arr) {
            System.out.print(i + " ");
        }


        if(pos > 0){
            for (int i = 0; i < pos; i++) {
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = tmp;
            }
        }
        if(pos < 0){
            for (int i = 0; i > pos; i--) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length - 1] = tmp;
            }
        }
        System.out.println("\nAfter: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // System.out.println(String.format("\n%40s", "").replace(' ','-'));

    }

    public static void main(String[] args) {

//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Task1");
        System.out.print("Before: ");
        printArray( arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) { arr[i] = 1;}
            else arr[i] = 0;
        }
        System.out.println();
        System.out.print("After: ");
        printArray(arr);
        System.out.println();
        System.out.println(String.format("%40s", "").replace(' ','*'));

//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arr2 = new int[8];
        int[] w = { 0, 3, 6, 9, 12, 15, 18, 21};
        System.out.println("Task2");
        System.out.print("Before: ");
        printArray( arr2);
        for (int i = 0, j = 0; i < w.length ; i++, j++) {
            arr2[j] = w[i];
        }
        System.out.println();
        System.out.print("After: ");
        printArray(arr2);
        System.out.println();
        System.out.println(String.format("%40s", "").replace(' ','*'));

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("Before: ");
        printArray( arr3);
        for (int i = 0; i < arr3.length; i++) {
            if( arr3[i] < 6) { arr3[i] *= 2; }
        }
        System.out.println();
        System.out.print("After: ");
        printArray(arr3);
        System.out.println();
        System.out.println(String.format("%40s", "").replace(' ','*'));

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int size = 5;
        int arr4[][] = new int[size][size];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < size; j++) {
                if(i == j)
                    arr4[i][j] = 1;
            }
        }
        System.out.println("Task4");
        printArrayMatrix(arr4);
        System.out.println();
        System.out.println(String.format("%40s", "").replace(' ','*'));

//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] arr5 = new int[]{1, 5, 3, 2};
        int minNum = arr5[0];
        int maxNum = arr5[0];
        System.out.println("Task5");
        printArray(arr5);
        for (int i = 0; i < arr5.length; i++) {
            if( minNum > arr5[i]) minNum = arr5[i];
            if( maxNum < arr5[i]) maxNum = arr5[i];
        }
        System.out.println();
        System.out.println("maxNum = " + maxNum);
        System.out.println("minNum = " + minNum);
        System.out.println(String.format("%40s", "").replace(' ','*'));

//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

        int[] a = new int[]{1, 1, 1, 2, 1};
        System.out.println("Task6");
        checkBalance(a);
        System.out.println(String.format("%40s", "").replace(' ','*'));

//7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        int[] b = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        //int[] c = new int[]{1, 2, 3, 4, 5};
        System.out.println("Task7");
        shiftElements(b, -2);
        shiftElements(b, 3);

    }

}
