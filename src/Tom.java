import java.util.Scanner;

public class Tom{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Person person=new Person();
        System.out.println("请输入姓名：");
        person.setName(scanner.next());
        System.out.println("请输入年龄：");
        person.setAge(scanner.nextInt());
        System.out.println("请输入体重：");
        person.setWeight(scanner.nextDouble());
        person.showinfo();
    }
}