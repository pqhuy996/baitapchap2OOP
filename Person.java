public class Person {
    String name;
    int age;
    String address;
    public Person(String name,int age, String address ){
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.print(this.name + " " + this.age + " " + this.address + " ");
    }
    static class Teacher extends Person {
        String institution_name;
        String course;
        public Teacher(String name, int age, String address, String institution_name, String course) {
            super(name, age, address);
            this.institution_name = institution_name;
            this.course = course;
            System.out.println(this.institution_name + " " + this.course);
        }
    }
}
