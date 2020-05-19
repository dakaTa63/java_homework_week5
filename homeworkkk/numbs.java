package homeworkkk;
import java.util.Random;
import java.util.Scanner;
import static homeworkkk.hww.menu;

public class numbs {
 //1
    public static void PrimeNumbers(int []array, int elements){
        int counter = 0;
        for(int i = 0; i < elements; i++){
            for(int j = 1; j <= array[i]; j++){
                    if(array[i] % j == 0){
                        counter += 1;
                    }
            }
            if(counter == 2){
                System.out.print(array[i] + " , ");

            }
                    counter = 0;

        }
        System.out.print("\b");
        System.out.print("\b");
        System.out.println();
        underMenu(array,elements);
    }
//2
    public static void mostFrequencyNumber(int []array, int elements){
        int counter = 0;
        int box = 0;
        int maxNumber = 0;
            for(int i = 0; i < elements; i++){

                for(int j = i; j < elements; j++){
                    if(array[i] == array[j] ){
                        counter += 1;
                    }
                        }
                if(maxNumber < counter){
                    maxNumber = counter;
                    box = array[i];
                }
                    counter = 0;

            }
            System.out.println("Най-често срещан елемент: " + box);
            underMenu(array,elements);
    }
//3
    public static void maxUprising(int []array, int elements){
        int counter = 0;
        int len_max = 0;
        int start_point = 0;
        int end_point = 0;
        int lock_and_unlock = 1;
        int i = 0;

        while (i < elements){
            int j = i + 1;
            while (j < elements){
                if (array[i] == (array[j] - 1)){
                    counter += 1;
                    if (lock_and_unlock == 0){
                        start_point = i;
                        lock_and_unlock = 1;
                    }

                    if (len_max < counter){
                        end_point = (counter + start_point) + 1;
                    }
                    i += 1;
                }else{
                    lock_and_unlock = 0;
                    break;
                }

                j += 1;
            }

            if (len_max < counter){
                len_max = counter;
            }

            counter = 0;
            i += 1;
        }

        if ((start_point == end_point) && (start_point != 0)){
            start_point -= 2;
        }
        else if (start_point > end_point){
            start_point = 0;
        }

        if (start_point == end_point){
            System.out.println("Няма нито един последователен масив!");
        }else{
            System.out.print("[");
            for (int print = start_point; print < end_point; print++){
                System.out.print(array[print] + ", ");
            }
            System.out.print("\b");
            System.out.print("\b");
            System.out.print("]");
            System.out.println();
        }
        underMenu(array,elements);
    }
//4
    public static void maxUprisingReverse(int []array, int elements){

        int counter = 0;
        int len_max = 0;
        int start_point = 0;
        int end_point = 0;
        int lock_and_unlock = 1;
        int i = 0;

        while (i < elements){
            int j = i + 1;
            while (j < elements){
                if (array[i] == (array[j] + 1)){
                    counter += 1;
                    if (lock_and_unlock == 0){
                        start_point = i;
                        lock_and_unlock = 1;
                    }

                    if (len_max < counter){
                        end_point = (counter + start_point) + 1;
                    }
                    i += 1;
                }else{
                    lock_and_unlock = 0;
                    break;
                }

                j += 1;
            }

            if (len_max < counter){
                len_max = counter;
            }

            counter = 0;
            i += 1;
        }

        if ((start_point == end_point) && (start_point != 0)){
            start_point -= 2;
        }
        else if (start_point > end_point){
            start_point = 0;
        }

        if (start_point == end_point){
            System.out.println("Няма нито един последователен масив!");
        }else{
            System.out.print("[");
            for (int print = start_point; print < end_point; print++){
                System.out.print(array[print] + ", ");
            }
            System.out.print("\b");
            System.out.print("\b");
            System.out.print("]");
            System.out.println();
        }
        underMenu(array,elements);
    }
//5
    public static void maxSameElement(int []array, int elements){

        int counter = 0;
        int len_max = 0;
        int start_point = 0;
        int end_point = 0;

        for (int i = 0; i < elements; i++){
            int j = i+1;

            while ((array[i] == array[j - 1]) && (j < elements)){
                counter += 1;
                j += 1;
            }

            if (len_max < counter){
                len_max = counter;
                start_point = i;
                end_point = (len_max + start_point);
            }

            counter = 0;
        }

        if (end_point == 1){
            System.out.println("Няма повтарящи се числа!");
        }else{
            System.out.print("[");
            for (int i = start_point; i < end_point; i++){
                System.out.print(array[i] + ", ");
            }
            System.out.print("\b");
            System.out.print("\b");
            System.out.print("]");
            System.out.println();
        }
        underMenu(array,elements);
    }
    //6
    public static void equalToRand(int []array, int elements){

        Random rand = new Random();
        int random_number = rand.nextInt((elements * (elements / 2)));
        int start_point = 0;
        int end_point = 0;
        int counter = 0;
        int sum;

        for (int i = 0; i < elements; i++) {
            int j = i + 1;
            sum = array[i];
            while ((j < elements) && (sum != random_number)) {
                counter += 1;
                sum += array[j];
                j += 1;
            }

            if ((sum == random_number) && (counter > 0)) {
                start_point = i;
                end_point = (counter + start_point);
            }

            counter = 0;
        }

        System.out.println("Произволното число е: " + random_number);
        if (start_point == end_point){
            System.out.println("Няма последователни числа на, които сбора и да е равен на произволното число!");
        }else{
            System.out.print("[");
            for (int i = start_point; i <= end_point; i++){
                System.out.print(array[i] + ", ");
            }
            System.out.print("\b");
            System.out.print("\b");
            System.out.print("]");
            System.out.println();
        }
        underMenu(array,elements);
    }

    public static void underMenu(int []array, int elements){

        Scanner inputMenu = new Scanner(System.in);
        System.out.println("1. Извеждане само на простите числа от масива");
        System.out.println("2. Извеждане на най-често срещан елемент в масива");
        System.out.println("3. Извеждане на максимална редица от нарастващи елементи в масива ");
        System.out.println("4. Извеждане на максимална редица от намаляващи елементи в масива ");
        System.out.println("5. Извеждане на максимална редица от еднакви елементи в масива ");
        System.out.println("6. Извеждане на последователност от числа от масива, които имат сума равна на число, генерирано на случаен принцип ");
        System.out.println("7. Връщане назад към основното меню ");
        System.out.print("Изберете опция: ");
        int underMenuPick = inputMenu.nextInt();
        switch (underMenuPick){

            case 1:
                PrimeNumbers(array,elements);
                break;
            case 2:
                mostFrequencyNumber(array,elements);
                break;
            case 3:
                maxUprising(array,elements);
                break;
            case 4:
                maxUprisingReverse(array,elements);
                break;
            case 5:
                maxSameElement(array,elements);
                break;
            case 6:
                equalToRand(array,elements);
                break;
            case 7:
               menu();
                break;

            default:
                underMenu(array , elements);
        }
    }
    public static void numberWork() {

        System.out.println("Въведете колко на брой числа ще въвеждате: ");
        int elements;
        Scanner input = new Scanner(System.in);
        while (true) {
            elements = Integer.parseInt(input.nextLine());
            if((elements > 0) && (elements < 10000)){
                break;
            }else {elements = 0;
                System.out.println("невалидно число");
            }
        }
        int []array = new int[elements];
        System.out.println("Въведете елементите: ");
        for (int i = 0; i < elements; i++) {
            array[i] = input.nextInt();
        }
        underMenu(array,elements);
    }
}
