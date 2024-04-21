public class Employee {

    // proos
    private int age;
    private String name;

    public Employee() {
    }


    //actions
    public void requestTravel(){
        System.out.println("I " + name + " Need to travel to Paris!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
