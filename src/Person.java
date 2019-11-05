public class Person{
    private String name;
    private int age;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
    public void showinfo(){
        System.out.println("姓名："+name+"年龄："+age+"体重"+weight);
    }
}