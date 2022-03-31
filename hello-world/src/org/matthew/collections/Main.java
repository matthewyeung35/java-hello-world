package org.matthew.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // not effective as length of array can't be changed
//        String[] names = {"a","b","c","d"};
//        String[] newNames = new String[5];
//        for (int i=0; i<names.length; i++) {
//            newNames[i] = names[i];
//        }
//        newNames[4] = "e";
//        System.out.println(newNames[4]);
        // two ways to define array
        ArrayList<String> names = new ArrayList<>();
        List<String> students = new ArrayList<>();
        names.add("Mei");
        names.add("Sara");
        System.out.println(names.get(0));
        System.out.println(names.size());
//        names.clear();
//        System.out.println(names.size());
        names.remove("Mei");
        System.out.println(names.get(0));
        System.out.println(names.contains("Mei"));
        System.out.println(names.isEmpty());
        System.out.println(names.indexOf("Sara"));
        System.out.println(names.indexOf("Brad"));
        names.add("Mei");
        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        //maps
        Map<String, String> emailList = new HashMap<>();
        emailList.put("Mei","mei@google.com");
        emailList.put("Brad","brad@gmail.com");
        System.out.println(emailList.get("Mei"));
        System.out.println(emailList.size());
        emailList.remove("Brad");
        System.out.println(emailList.size());
        System.out.println(emailList.containsKey("Mei"));
        System.out.println(emailList.containsValue("mei@google.com"));

        //pass a class into array list
        ArrayList<Student> students2 = new ArrayList<Student>();
        students2.add(new Student("Mei",15));
        students2.add(new Student("Brad",14));

        for (Student s: students2){
            System.out.println(s.getName());
        }
    }
}
