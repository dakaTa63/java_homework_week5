package homeworkkk;
import java.util.Scanner;
import static homeworkkk.numbs.numberWork;
import static homeworkkk.words.wordS;
public class hww {

    public static void menu (){

        System.out.println("1.Работа с числа ");
        System.out.println("2. Работа с думи ");
        System.out.println("3.Изход от програмата ");
        System.out.println("========================");
        System.out.println("ИЗБЕРЕТЕ ОПЦИЯ: ");
        while(true){

            Scanner pick = new Scanner(System.in);
            String madePick = pick.nextLine();

            if(madePick.equals("1")){
                System.out.println("Избрахте /работа с числа/ ");
                numberWork();
            }

            if(madePick.equals("2")){
                System.out.println("Избрахте /работа с думи/ ");
                     wordS();
            }

            if(madePick.equals("3")){
                System.out.println("Избрахте /изход от програмата/ (っ◔◡◔)っ ♥ GGWP ♥ ");
               System.exit(0);
            }

        }
    }
}
