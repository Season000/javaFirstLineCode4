public class extends1 {
    public static void main(String args[]){
        student stu = new student();
        System.out.println(stu.getInfo());
        stu.setName("season");
        stu.setAge(18);
        System.out.println(stu.getInfo());

    }
}
class student extends person{
}

class person{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getInfo(){
        return "the name is :" + this.name + " and the age is:" + this.age;
    }
}

