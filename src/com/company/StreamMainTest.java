package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMainTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ddd2");
        stringList.add("aaa2");
        stringList.add("bbb1");
        stringList.add("aaa1");
        stringList.add("bbb3");
        stringList.add("ccc");
        stringList.add("bbb2");
        stringList.add("ddd1");
        stringList.stream()
                .forEach(e-> System.out.println(e));
    }
}
