package homeworkkk;
import java.util.Scanner;
import static homeworkkk.hww.menu;

public class words {
    //1
    public static void reverseWords(String[]str, int elements){

        System.out.print("[");
        for (int i = 1; i < elements; i++){
            for(int j = (str[i].length() - 1); j >= 0; j--){
                System.out.print(str[i].charAt(j));
            }
            System.out.print(", ");
        }
        System.out.print("\b");
        System.out.print("\b");
        System.out.print("]");
        System.out.println();
        wordMenu(str,elements);
    }

    //2
    public static void numberOfRepeatingSymbols(String[]str, int elements){
        int counter = 0;
        char box = ' ';

        for (int i = 1; i < elements; i++){
            for (int j = 0; j < str[i].length(); j++){
                if (box != str[i].charAt(j)){
                    for (int k = j+1; k < str[i].length(); k++){
                        if (str[i].charAt(j) == str[i].charAt(k)){
                            counter += 1;
                        }
                    }
                }

                if (counter > 0){
                    box = str[i].charAt(j);
                    for (int l = 0; l < str[i].length(); l++){
                        System.out.print(str[i].charAt(l));
                    }
                    System.out.print(" - брой повтарящи се символи: " + (counter + 1) + " - буква " + box);
                    System.out.println();
                    counter = 0;
                }
            }

            if (box == ' '){
                for (int l = 0; l < str[i].length(); l++){
                    System.out.print(str[i].charAt(l));
                }
                System.out.print(" - брой повтарящи се символи: " + counter);
                System.out.println();
            }

            box = ' ';
        }
        wordMenu(str,elements);

    }
    //3
    public static void numberOfSymbolsForEachWord(String[]str, int elements){

        for (int i = 1; i < elements; i++){
            for (int j = 0; j < str[i].length(); j++){
                System.out.print(str[i].charAt(j));
            }
            System.out.println(" – брой символи: " + str[i].length());
        }
        wordMenu(str,elements);
    }
    //4
    public static void numberOfRepeatingWords(String[]str, int elements){
            int counter = 0;
            int loo = 1;

            for (int i = 1; i < elements; i++){
                for (int j = i+1; j < elements; j++){
                    int in_counter = 0;
                    int d_len = Math.min(str[i].length(), str[j].length());
                    for (int k = 0; k < d_len; k++){
                        if (Character.toLowerCase((str[i].charAt(k))) == Character.toLowerCase((str[j].charAt(k)))){
                            in_counter += 1;
                        }
                    }

                    if (in_counter == str[i].length()){
                        counter += 1;
                    }
                }

                if (counter > 0){
                    for (int l = 0; l < str[i].length(); l++){
                        System.out.print(str[i].charAt(l));
                    }
                    System.out.println(" – брой повторения: " + (counter + 1));
                    loo = 0;
                }
                counter = 0;
            }

            if (loo == 1){
                System.out.println("Няма повтарящи се думи!");
            }
        wordMenu(str,elements);
        }

    public static void wordMenu(String[]str, int elements) {


        Scanner inputMenu2 = new Scanner(System.in);

        System.out.println("1. Обърнете буквите на думите от масива наобратно и ги визуализирайте в конзолата ");
        System.out.println("2. Изведете броя на повтарящите се символи за всяка една от думите в масива ");
        System.out.println("3. Изведете броя на символите за всяка една от думите в масива ");
        System.out.println("4. Изведете броя на повтарящите се думи от масива");
        System.out.println("5. Връщане назад към основното меню ");

        int underMenu2 = inputMenu2.nextInt();
        switch (underMenu2){

            case 1:
                reverseWords(str,elements);
                break;

            case 2:
                numberOfRepeatingSymbols(str,elements);
                break;

            case 3:
                numberOfSymbolsForEachWord(str,elements);
                break;

            case 4:
                numberOfRepeatingWords(str,elements);
                break;

            case 5:
                menu();
                break;
            default:
                wordMenu(str,elements);
        }
    }

    public static void wordS() {
        Scanner input = new Scanner(System.in);
        System.out.print("Вкарай дължината на масива: ");
        int elements = input.nextInt();
        elements += 1;
        String[] str = new String[elements];
        for(int i = 0; i < elements; i++){
            str[i] = input.nextLine();
            if (i < (elements - 1)){
                System.out.print("Въведи " + (i + 1) + "-та дума: ");
            }
        }

        wordMenu(str,elements);
    }

}


