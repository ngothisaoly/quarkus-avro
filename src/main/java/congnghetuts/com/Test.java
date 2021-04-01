package congnghetuts.com;

import congnghetuts.com.avro.Person;
import congnghetuts.com.avro.PrimaryType;

import java.nio.ByteBuffer;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setName("Cong nghe tuts");
        System.out.println("------------------------------" + person);


        PrimaryType primaryType = new PrimaryType();
        Void nullN = primaryType.getNullN();
        boolean booleanN = primaryType.getBooleanN();
        int intN = primaryType.getIntN();
        long longN = primaryType.getLongN();
        float floatN = primaryType.getFloatN();
        double doubleN = primaryType.getDoubleN();
        ByteBuffer bytesN = primaryType.getBytesN();
        String stringN = primaryType.getStringN();
    }
}


