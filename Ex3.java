import java.util.Scanner;
import java.util.Stack;
public class Ex3 {
    public static void main(String[] args) {
        String str_command = "";
        Stack<Float> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float num1 = scan.nextFloat();;
        float result = 0;
        while (!str_command.equals("stop")){
            stack.push(num1);
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scan.next();
        System.out.println("Введите второе число: ");
        float num2 = scan.nextFloat();
        switch (operations) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        System.out.printf("%f %s %f = %f \n", num1, operations, num2, result);
        num1 = result;
        System.out.println("Введите return для возврата");
            System.out.println("или введите forward для продолжения");
            str_command = scan.next();

            switch (str_command){
                case ("return"):
                    num1 = stack.pop();
                    System.out.printf("отмена \n");
                    System.out.printf("Первое число: %f \n", num1 );
                    break;
                case ("forward"):
                    System.out.printf("Первое число: %f \n", num1 );
                    break;
                }   
            }
          scan.close();       
        }     
    }