package congnghetuts.com;

import congnghetuts.com.avro.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setName("Cong nghe tuts");
        System.out.println("------------------------------" + person);
    }
}


