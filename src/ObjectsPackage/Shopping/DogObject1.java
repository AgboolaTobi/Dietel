package ObjectsPackage.Shopping;

public class DogObject1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setName("Brack");
        dog1.setBreed("cocasian");
        dog2.setName("Hilary");
        dog2.setBreed("german Shepard");
        System.out.println(dog1.getName() + "\n"+ dog1.getBreed());
        System.out.println(dog2.getName() + "\n"+ dog2.getBreed());
    }
}
