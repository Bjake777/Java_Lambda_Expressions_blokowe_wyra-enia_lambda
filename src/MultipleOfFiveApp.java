public class MultipleOfFiveApp {
    public static void main(String[] args) {
        MultipleOfFive multipleOfFive = ((number1, number2, number3) -> number1 % 5 == 0 && number2 % 5 == 0 && number3 % 5 == 0);

        System.out.println(multipleOfFive.check3Numbers(10, 100, 5));
        System.out.println(multipleOfFive.check3Numbers(1, 50, 55));
    }
}
