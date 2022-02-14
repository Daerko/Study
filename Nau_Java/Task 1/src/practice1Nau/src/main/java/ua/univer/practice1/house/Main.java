package practice1Nau.src.main.java.ua.univer.practice1.house;


import practice1Nau.src.main.java.ua.univer.practice1.residents.cats.Cat;
import practice1Nau.src.main.java.ua.univer.practice1.residents.cats.Kitten;
import practice1Nau.src.main.java.ua.univer.practice1.residents.dogs.Dog;
import practice1Nau.src.main.java.ua.univer.practice1.residents.dogs.Puppy;

public class Main {

    public static  void  main (String[] args) {
        Dog  rex = new Dog ("Rax");
        Puppy randy = new Puppy("Randy");
        Cat barbos = new Cat("Barbos");
        Kitten murzik = new Kitten("Murzik");

        House <Dog> dogHouse  = new House();
        dogHouse.enter(rex);
        dogHouse.enter(randy);
        dogHouse.enter(murzik);
        System.out.println(dogHouse);

        House <Cat> catHouse = new  House ();
        catHouse.enter(barbos);
        catHouse.enter(murzik);
        catHouse.enter(rex);
        System.out.println(catHouse);
    }
}
