package org.matthew.singleton;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance("db_music");
//        Database testDatabase = new Database("db_movie"); can only hv 1 instance of the class
        System.out.println(database.toString());

    }
}
