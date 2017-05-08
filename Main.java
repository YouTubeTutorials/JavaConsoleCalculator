import sun.security.util.Length;

import java.util.Scanner;

// Main class -> De class waar alles begint
public class Main {
    public static Scanner scn = new Scanner(System.in);
    // main Method -> De functie / method die aan het begin van het programma wordt uitgevoerd.
    public static void main(String[] args) {
        System.out.print("Geef de som: ");
        String som = scn.nextLine();

        String operator = getOperator(som);
        float firstNumber = Float.parseFloat(GetNumber(som, 0));
        float secondNumber = Float.parseFloat(GetNumber(som, 2));

        if (operator.charAt(0) == '+') {
            System.out.println(AddNumbers(firstNumber, secondNumber));
        } else if (operator.charAt(0) == '-') {
            System.out.println(SubtractNumbers(firstNumber, secondNumber));
        } else if (operator.charAt(0) == '*') {
            System.out.println(MultiplyNumbers(firstNumber, secondNumber));
        } else if (operator.charAt(0) == '/') {
            System.out.println(DevideNumbers(firstNumber, secondNumber));
        } else {
            System.out.println("De som is van een verkeerd formaat.");
        }
    }

    public static String getOperator(String input) {
        Boolean space = false;
        Boolean finished = false;
        String operator = "";
        
        for(int i = 0; i <= input.length() - 1; i++) {
            char letter = input.charAt(i);

            if(letter == ' ') {
                if (space == true) {
                    space = false;
                    finished = true;
                }
            }
            
            if (space) {
                operator = Character.toString(letter);
            }

            if(!finished) {
                if (letter == ' ') {
                    if (space == false) {
                        space = true;
                    }
                }
            }
        }
        return operator;
    }

    public static String GetNumber(String input, int index) {
        int currentIndex = 0;
        String number = "";

        for(int i = 0; i <= input.length() - 1; i++) {
            char letter = input.charAt(i);

            if(letter == ' ') {
                currentIndex += 1;
            }
            else {
                if (currentIndex == index) {
                    number = number + letter;
                }
            }
        }

        return number;
    }

    public static float AddNumbers(float A, float B) {
        float Sum = A + B;
        return Sum;
    }

    public static float SubtractNumbers(float A, float B) {
        float Sum = A - B;
        return Sum;
    }

    public static float DevideNumbers(float A, float B) {
        float Sum = A / B;
        return Sum;
    }

    public static float MultiplyNumbers(float A, float B) {
        float Sum = A * B;
        return Sum;
    }
}
