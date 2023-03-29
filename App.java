import java.util.Scanner;

public class App {

    static final Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[] nums;
        double num1;
        double num2;
        boolean contin = true;

        Calculator myCalc = new Calculator();

        while (contin){

            nums = getDouble("Enter both numbers and the operation sign")

           // num1 = getDouble("Enter the first number: ");
            // num2 = getDouble("Enter the second number: ");
            double answer;
            String continueString;
            int operInt;
            String outString;

            operInt = Integer.parseInt(getString("1 for add, 2 for subtraction, 3 for division, 4 for multiplication: "));

            switch (operInt){
                case 1:
                    answer = myCalc.add(num1, num2);
                    outString = String.format("%f plus %f equals %f", num1 , num2, answer);
                    break;
                case 2:
                    answer = myCalc.subtract(num1, num2);
                    outString = String.format("%f minus %f equals %f", num1 , num2, answer);
                    break;
                case 3:
                    if (num2 != 0){
                        answer = myCalc.divide(num1, num2);
                        outString = String.format("%f divided by %f equals %f", num1 , num2, answer);
                    }else{
                        outString = ("This isn't number theory.");
                    }
                    break;
                case 4:
                    answer = myCalc.multiply(num1, num2);
                    outString = String.format("%f multiplied by %f equals %f", num1 , num2, answer);
                    break;
                default:
                    outString = ("INVALID ENTRY");
                    break;
            }

            System.out.print(outString);

            continueString = getString("\nWould you like to continue? (yes for yes, no for no): ");
            if (continueString.equals("yes")){
                contin = true;
            }else{
                contin = false;
            }
        }
        System.out.println("Goodbye");
    }

    private static String getString(String prompt){
        System.out.println(prompt);
        return inputScanner.nextLine();
    }

    private static double[] getDouble(String prompt){
        double workingDub;
        System.out.println(prompt);
        String inputString = inputScanner.nextLine();
        String[] currencies = inputString.split(" ");
        for (int i = 0; i < currencies.length(); i++){
            if
        }
        workingDub = Double.parseDouble(inputString);
        return  workingDub;
    }
}