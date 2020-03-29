package mos.demo;

import java.util.HashMap;
import java.util.Map;

public class hashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap();

        hashMap.put("123", 2);
        hashMap.put("123", 2);

        System.out.println(hashMap);
    }
}
