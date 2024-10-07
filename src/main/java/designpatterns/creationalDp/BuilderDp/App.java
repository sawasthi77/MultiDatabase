package designpatterns.creationalDp.BuilderDp;

public class App {
    public static void main(String[] args) {
        Student student = new Student.Builder("Sam", "Ivy", 32).build();
        System.out.println(student.toString());
    }
}
