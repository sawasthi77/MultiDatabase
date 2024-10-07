package designpatterns.creationalDp.BuilderDp;

public class Student {
    private String name;
    private String uni;
    private int age;

    public Student(Builder builder){
        this.name = builder.name;
        this.uni = builder.uni;
        this.age = builder.age;
    }

    public static class Builder{
        private final String name;
        private final String uni;
        private int age;

        public Builder(String name, String uni){
            this.name = name;
            this.uni = uni;
        }

        public Builder (String name, String uni, int age){
            this.name = name;
            this.uni = uni;
            this.age= age;
        }

        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", uni='" + uni + '\'' +
                ", age=" + age +
                '}';
    }
}
