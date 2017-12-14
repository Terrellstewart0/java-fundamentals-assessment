import java.util.Scanner;

public class Person {
    private String name;
        Scanner sc = new Scanner(System.in);

    public Person(String name) {
        this.name = name;
    }

    public String getName() {

return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
