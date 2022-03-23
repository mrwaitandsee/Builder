public class Person {
    private String firstname = "default_firstname";
    private String lastname = "default_lastname";

    @Override
    public String toString() {
        return firstname + ";" + lastname;
    }
}