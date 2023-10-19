import java.util.Objects;

public class Main {
    public static void main(String[] args){
        System.out.println("Testing Docker File");
        Calculator calculator = new Calculator();

        String calcType = args[0];
        int first = Integer.parseInt(args[1]);
        int second = 0;

        if (args.length > 2 && args[2] != null) {
            second = Integer.parseInt(args[2]);
        }

        if(calcType.equalsIgnoreCase("add")){
            System.out.println(calculator.add(first, second));
        } else if (calcType.equalsIgnoreCase("subtract")) {
            System.out.println(calculator.subtract(first, second));
        } else if (calcType.equalsIgnoreCase("multiply")) {
            System.out.println(calculator.multiply(first, second));
        } else if (calcType.equalsIgnoreCase("binary")){
            System.out.println(calculator.intToBinaryNumber(first));
        } else{
            System.out.println("Incorrect input");
        }
    }
}
