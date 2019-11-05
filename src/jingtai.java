public class jingtai{
    String name="hello";
    static String hobby="world";
    public static void print1(){
//       System.out.println(name);
        System.out.println(hobby);
        jingtai.print1();
        jingtai jt=new jingtai();
        jt.print2();
    }
    public void print2(){
        System.out.println(name);
        System.out.println(hobby);
        jingtai.print1();
        jingtai jt=new jingtai();
        jt.print2();
    }
}