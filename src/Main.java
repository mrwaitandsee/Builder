

public class Main {
    public static void main(String args[]) {
        var person = (Person) Builder.from(Person.class)
                .with("firstname", "Anton")
                .with("lastname", "Kosterev")
                .build();

        System.out.println(person.toString());
    }
}
