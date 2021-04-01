package congnghetuts.com;

import congnghetuts.com.avro.mapTest;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        mapTest mapTest = new mapTest();
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key2", "value2");
        mapTest.setMapN(map);

        System.out.println(mapTest);
    }
}
