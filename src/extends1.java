public class extends1 {
    public static void main(String args[]){
//        student stu = new student("season",18);
//        System.out.println(stu.getInfo());
//        System.out.println(stu.getInfo());
        person p = new person("zhushoiucheng",23);
        person p1 = new person();
    }
}
class person{
    private String name;
    private int age;
    person(){
        System.out.println("this is a houzaofangfa!");
    }

    person(String name){
        this.name = name;
    }
    person(String name , int age){
        this.name = name;
        this.age = age;
    }

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

