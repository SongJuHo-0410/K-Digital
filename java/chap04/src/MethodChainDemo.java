class Person{
    String name;
    int age;

    public Person setName(String name){
        this.name = name;
        return this;
    }

    public Person setAge(int age){
        this.age = age;
        return this;
    }

    public void sayHello(){
        System.out.println("Hi, I'm " + name + " and " + age + "years old.");
    }
}

public class MethodChainDemo {
    public static void main(String[] args){
        Person person = new Person();
        person.setName("민국").setAge(21).sayHello();
    }
    
}
