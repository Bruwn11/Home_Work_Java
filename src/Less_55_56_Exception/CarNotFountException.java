package Less_55_56_Exception;
/*Свое исключение (тренируемся выбрасывать)
Напишите свое исключение CarNotFountException, наследуемое от RuntimeException.
Напишите List<Car> с несколькими машинами и метод public Car getCar(…) для получения машины из списка
(способ поиска машины в списке не важен, сделайте как нравится).
В методе getCar в случае отсутствия нужной машины в списке выбрасывайте исключение CarNotFountException
с соответствующим сообщением, например «Машина с параметрами …как вы искали машину… в списке не найдена»*/


public class CarNotFountException extends RuntimeException {
    /*public void printException(Car car){
        System.out.println("Машина с параметрами" + car.getModel() +
                " и " + car.getPower() + " в данном списке не найдена");
    }*/

    public CarNotFountException(String message) {
        super(message);
    }
}
