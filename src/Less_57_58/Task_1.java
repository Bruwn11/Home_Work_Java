package Less_57_58;

public class Task_1 {
    public static void main(String[] args) {
        Printer printer1 = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printer1.print("Я напечатал");
        Printer printer2 = (message) -> System.out.println(message);
        printer2.print("Я напечатал что-то ещё");

        Printer printer3 = message -> {
            System.out.println(message);
            System.out.println("Длина вашего сообщения равна " + message.length() + " символам");
        };
        printer3.print("Привет");

    }
}





