public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
       int a = 3;
       int b = 6;
       if (a + b >= 0) {
           System.out.println("Сумма положительна");
       }
       else {
           System.out.println("Сумма отрицательна");
       }
    }
    public static void printColor(){
        int value = 66;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 46;
        int b = 87;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
