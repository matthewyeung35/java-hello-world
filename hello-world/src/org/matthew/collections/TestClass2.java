package org.matthew.collections;

public class TestClass2 {
    private int age;
    private String color;

    private class TestInnerClass{ //can use private and static class with inner class
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public TestInnerClass(String name) {
            this.name = name;
        }
        private void printAge(){
            System.out.println("Age: " + age);
        }
    }
}
