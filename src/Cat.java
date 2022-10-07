import java.sql.SQLOutput;

public class Cat {
    String name;
    int paws;
    int tail;
    String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void catOfmilk() {
        for (int i = 0; i < 3; i++) {
            System.out.println("МЯУ!");
        }
        System.out.println("Кошка любит молоко");
    }
}

