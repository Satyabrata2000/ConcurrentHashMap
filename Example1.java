package ConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;


class Example1 {

    public static void main(String[] args) {

        HashMap<String, Integer> mapcon = new HashMap<>();
        mapcon.put("a", 1);
        mapcon.put("b", 2);
        mapcon.put("c", 3);
        mapcon.put("d", 4);
        System.out.println(mapcon);

        for (Map.Entry m : mapcon.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        System.out.println(mapcon.toString());
        mapcon.computeIfAbsent("e", g -> 1+2);
        mapcon.computeIfAbsent("f", g->3+4);
        System.out.println(mapcon);

    }
}

