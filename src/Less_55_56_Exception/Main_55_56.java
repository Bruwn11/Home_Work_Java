package Less_55_56_Exception;
/* Исключение ArithmeticException (тренируемся перехватывать)
-Напишите метод деления одного числа на другое (принимает два int-а, возвращает int).
-Проверьте поведение при передаче нуля в качестве знаменателя (при делении на нуль что произойдёт).
-Перехватите и обработайте с помощью try-catch выпадающее исключение
(можно просто вывести сообщение об ошибке, подумайте где лучше его перехватить – в самом методе
 или в месте его вызова – попробуйте по-разному и сравните эти варианты) */

import java.util.ArrayList;
import java.util.List;

public class Main_55_56 {
    public static void main(String[] args) {
        System.out.println(task1(16, 0));

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Niva", 240));
        cars.add(new Car("Volga", 310));
        cars.add(new Car("BMW", 130));
        cars.add(new Car("Mercedes", 200));
        cars.add(new Car("Porsche", 350));
        Car myCar1 = new Car("Niva", 240);
        Car myCar2 = new Car("Nissan", 260);
        try {
            myCar1.getCar(cars);
            myCar2.getCar(cars);
        } catch (CarNotFountException e) {
            System.out.println(e.getMessage());
        }

        passwordVerification("MyPassword123");
        passwordVerification("ffffff66");
        passwordVerification("ShlechtPass");
        passwordVerification("aSdf3h");
        passwordVerification("avalanche gt2020");
    }

    /**
     * Метод, который делит одно число на другое. Не выбрасывает исключение ArithmeticException.
     * @param a1 - целое число a1.
     * @param a2 - целое число a2.
     * @return - результат деления - целое число.
     */
    public static int task1(int a1, int a2) {
        try {
            return a1 / a2;
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя.");
            return 0;
        }
    }

    /**
     * Метод, который проверяет пароль, void.
     * @param password - String password. Введённый пароль.
     */
    public static void passwordVerification(String password) {
        boolean hasLengthPassword = false;
        String passwordLength = " Должен быть длиной от 8 до 20 символов.";
        boolean hasUpperCasePassword = false;
        String passwordUpperCase = " Должен содержать хотя бы одну заглавную букву.";
        boolean hasLowerCasePassword = false;
        String passwordLowerCase = " Должен содержать хотя бы одну строчную букву.";
        boolean hasDigitPassword = false;
        String passwordDigit = " Должен содержать хотя бы одну цифру.";
        boolean hasWhitespacePassword = false;
        String passwordWhitespace = " Не должен содержать пробелов.";
        String passwordCorrect = " Пожалуйста придумайте новый пароль.";

        if (password.length() >= 8  && password.length() <= 20) {
            hasLengthPassword = true;
            passwordLength = "";
        }

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCasePassword = true;
                passwordUpperCase = "";
                break;
            }
        }

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowerCasePassword = true;
                passwordLowerCase = "";
                break;
            }
        }

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigitPassword = true;
                passwordDigit = "";

                break;
            }
        }

        if (!password.contains(" ")){
            hasWhitespacePassword = true;
            passwordWhitespace = "";
        }

        if(hasLengthPassword && hasUpperCasePassword && hasLowerCasePassword
                && hasDigitPassword && hasWhitespacePassword){
            passwordCorrect = " Корректный, может быть использован.";
        }

        System.out.println("Ваш пароль - " + password + passwordLength + passwordUpperCase + passwordLowerCase
         + passwordDigit + passwordWhitespace + passwordCorrect);

    }
}

