package org.lucky.classes;

 interface Animal {
    default public String identifyMyself() {
        return "I am an animal.";
    }
}
 interface EggLayer extends Animal {
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}
 interface FireBreather extends Animal { }
public class Dragon implements EggLayer, FireBreather {
    public static void main (String... args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }
}