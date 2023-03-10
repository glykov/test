public class Car extends Vehicle implements Checkable {
//    public String modelName;
//    public int wheelsCount;
//
//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }

    public void check() {
        System.out.println("Проверяем двигатель");
    }

    public Car(String name, int wheels) {
        super(name, wheels);
    }
}
