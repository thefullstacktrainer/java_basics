package co_varient_type;

public class CoVarientType {
    public static void main(String[] args) {
        DogShelter ds = new DogShelter();
        System.out.println(ds.getAnimal());

        GermanShepherdDogShelter gd = new GermanShepherdDogShelter();
        System.out.println(gd.getAnimal());

    }
}

class Animal {

}

class Dog extends Animal {

}

class GermanShepherd extends Dog {

}

class AnimalShelter {
    Animal getAnimal() {
        return new Animal();
    }
}

class DogShelter extends AnimalShelter {
    @Override
    Dog getAnimal() {
        return new Dog();
    }
}

class GermanShepherdDogShelter extends AnimalShelter {
    @Override
    GermanShepherd getAnimal() {
        return new GermanShepherd();
    }
}