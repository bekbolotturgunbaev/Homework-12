import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        /**
         * Рыба
         */
        Fish fish = new Fish();

        System.out.println("Что такое Фуга?");
        fish.fishOfwater();

        fish.setName("Фуга");
        fish.setHead(1);
        fish.setEyes(2);

        System.out.println("Имя: "+fish.getName());
        System.out.println("Голова: "+fish.getHead());
        System.out.println("Глаза: "+fish.getEyes()+"\n");


        /**
         * Попугай
         */
        Parrot parrot = new Parrot();

        System.out.println("Что есть у Попугая и что он может делать?");
        parrot.setKluv(1);
        parrot.setWings(2);
        parrot.setPaws(2);
        parrot.setColor("Красный");

        System.out.println("Клюв: "+parrot.getKluv());
        System.out.println("Крылья: "+parrot.getWings());
        System.out.println("Лапы: "+parrot.getPaws());
        System.out.println("Цвет: "+parrot.getColor());
        parrot.parrotOffly();


        /**
         * Кошка
         */
        Cat cat = new Cat();

        System.out.println("\nЧто любит Кошка?");
        cat.setName("Багира");
        cat.setPaws(4);
        cat.setTail(1);
        cat.setColor("Черный");

        System.out.println("Имя: "+cat.getName());
        System.out.println("Лапы: "+cat.getPaws());
        System.out.println("Хвост: "+cat.getTail());
        System.out.println("Цвет: "+cat.getColor());
        cat.catOfmilk();


        /**
         * Собака
         */
        Dog dog = new Dog();

        dog.setName("Дред");
        dog.setPaws(4);
        dog.setTail(1);
        dog.setColor("Белый");
        dog.setBreed("Питбуль");

        System.out.println("\nИмя собаки: "+dog.getName());
        System.out.println("Лапы: "+dog.getPaws());
        System.out.println("Хвост: "+dog.getTail());
        System.out.println("Цвет: "+dog.getColor());
        System.out.println("Порода: "+dog.getBreed());


    }
}
