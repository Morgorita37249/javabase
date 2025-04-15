package hashcode;

public class Person {
    private String login = "ablazzing";
    private String pass = "";
    public Person(String pass){
        this.pass = pass;
    }
    @Override
    public int hashCode(){
        return (this.login).length();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        return obj instanceof Person person && this.pass.equals(person.pass);
    }
}
