import java.util.Scanner;

//1 main class
public class Main {
    public static void main(String[] args) {

        //2.Integer array
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        //3.String array
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        //9. Object Translator
        Translator translate = new Translator(alphabetic, numeric);

        //12 Boolean String en Scanner
        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);

        //13 While loop
        while (play == true) {
            //14. Loop print en Scanner
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();

            // 15. If else

            if (input == "X") {
                play = false;
            } else if (input == "V") {
                System.out.println("Typ een cijfer van 0 t/m 9");
                int number = scanner.nextline();
            } if (number < 10) {
                String result = translator.translate(number);
                System.out.println("De vertaling van " + number + " is " + result);
            } else {
                        System.out.println("ongeldig");
                    }
                } else (input != "X" && input != "Y") {
                     System.out.println("ongeldig");
                    }
                }
            }




