public class Main {
    public static void main(String[] args) {
        String myFirstVariable;
        final int NUM = 17;
        String work = "summer";
        myFirstVariable = NUM + work;
        System.out.println(String.format("%s %s %s", myFirstVariable, NUM, work));
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("ВЫ сохранили положительное число");
        } else
            System.out.println("Вы сохранили ноль");
        {
            
        }

    }
}