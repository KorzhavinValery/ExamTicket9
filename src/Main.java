public class Main {
    //Напишите пример обработки нескольких исключений в одном блоке catch.
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 30 / 1;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}