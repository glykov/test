public class Bicycle extends Vehicle {
//    public String modelName;
//    public int wheelsCount;
//
//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }

    public Bicycle(String name, int wheels) {
        super(name, wheels);
    }

    public String myName() {
        return this.getModelName();
    }
}
