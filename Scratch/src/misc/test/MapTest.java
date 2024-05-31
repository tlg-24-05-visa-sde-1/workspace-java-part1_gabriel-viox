package misc.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap<>();
        gpaMap.put("breana", 3.6);
        gpaMap.put("Doug", 1.87);
        gpaMap.put("Daiyron", 3.5);
        gpaMap.put("Amir", 3.8);
        gpaMap.put("Gabriel", 2.3);
        gpaMap.put("Coty",4.0);

        dump(gpaMap);
        System.out.println();

        System.out.println("The student's GPA was : " + gpaMap.get("Gabriel"));
        System.out.println();

        Collection<Double> gpaValues = gpaMap.values();
        // for each value in gpaValue return the gpa's that are greater than 3.5
        for (Double gpaValue : gpaValues) {
            if (gpaValue >= 3.5) {
                System.out.println(gpaValue);
             }
        }
        System.out.println();
        // gpa >= 2.0
        for (var entry : gpaMap.entrySet()){
            if (entry.getValue() >= 2.0){
                System.out.println(entry.getKey());
            }
        }
    }

    private static void dump(Map<String,Double> map){
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }

}
