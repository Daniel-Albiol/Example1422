import java.util.Scanner;
public class Example1422 {
    public static void main(String[] argv) {
        float number1;
        float number2;
        float number3;
        float firstOne;
        float secondOne;
        float third;


        System.out.println("Enter the number1:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        number1 = inputValue.nextFloat();
        System.out.println("Enter the number2:");
        number2 = inputValue.nextFloat();
        System.out.println("Enter the number3:");
        number3 = inputValue.nextFloat();
        if (number1 >= number2) {
            if (number2 >= number3) {
                System.out.println("The order is first one: " + number1);
                System.out.println("The order is second one: " + number2);
                System.out.println("The order is third: " + number3);

            } else {
                if (number1 >= number3) {
                    System.out.println("The order is first one: " + number1);
                    System.out.println("The order is second one: " + number3);
                    System.out.println("The order is third: " + number2);
                } else {
                    System.out.println("The order is first one: " + number3);
                    System.out.println("The order is second one: " + number1);
                    System.out.println("The order is third: " + number2);
                }
            }
        } else if (number2 >= number3) {
            if (number3 >= number1) {
                System.out.println("The order is first one: " + number2);
                System.out.println("The order is second one: " + number3);
                System.out.println("The order is third: " + number1);
            }
        } else {
            System.out.println("The order is first one: " + number2);
            System.out.println("The order is second one: " + number1);
            System.out.println("The order is third: " + number3);
        }


    }


}
