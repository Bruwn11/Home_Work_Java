package Less_55_56_Exception;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String model;
    private final int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
    }
    public Car(Car other){
        this.model = other.model;
        this.power = other.power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    /**
     * Данный метод позволяет узнать: есть ли ваша машина в каком-то списке машин
     * Если машина есть в списке, метод вернёт соответствующую запись об этом.
     * Если машины нет в списке - то будет выброшено исключение CarNotFountException
     * @param list - List<Car> list. Список машин.
     * @return Car - объект-машина, при отсутствии CarNotFountException
     */
    public Car getCar(List<Car> list){
        List<Car> lists = new ArrayList<>(list);
            for (Car c : lists) {
                if (c.getPower()== this.getPower() && c.getModel().equalsIgnoreCase(this.getModel())) {
                    System.out.println("Ваша машина:  модель - " + model + ", силой - " + power + " есть в списке.");
                    return this;
                }
            }
        throw new CarNotFountException("Машина с параметрами " + this.getModel() +
                " и " + this.getPower() + " в данном списке не найдена");
    }
}
