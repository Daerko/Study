package ua.univer.practice1.house;

import ua.univer.practice1.residents.cats.Cat;
import ua.univer.practice1.residents.cats.Kitten;
import ua.univer.practice1.residents.dogs.Dog;
import ua.univer.practice1.residents.dogs.Puppy;

import java.util.ArrayList;
import java.util.List;

public class House<T> {

    private final List <T>  residents = new ArrayList();

    public void enter(T resident) {
        residents.add(resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("There are following residents in the house:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }
}
