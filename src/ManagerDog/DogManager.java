package ManagerDog;

import ManagerDog.Dog;

import java.util.ArrayList;

public class DogManager {
    ArrayList<Dog> dogs;

    public DogManager(ArrayList<Dog> dogs) {
        this.dogs = dogs;
    }

    public DogManager() {
        dogs = new ArrayList<>();
    }

    public void display() {
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).toString());
        }
        System.out.println("===========================================");
    }

    public void add(Dog dog) {
        dogs.add(dog);
    }

    public int search(double weight) {
        for (int i = 0; i < dogs.size(); i++) {
            if (weight == dogs.get(i).getWeigth()) {
                return i;
            }
        }
        return -1;
    }
    public void delete(double weigth) {
            int index = search(weigth);
            if (index == -1) {
                System.out.println("không có con chó cần bắt");
            } else {
                dogs.remove(search(weigth));
            }
        }
    }

