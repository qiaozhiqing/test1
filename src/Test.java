import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
private static ArrayList<Product> p=new ArrayList<>();
private static ArrayList<Product> newp=new ArrayList<>();
static Scanner input =new Scanner(System.in);
static{
    Product p1=new Product("可乐",2,10);
    Product p2=new Product("啤酒",3,8);
    Product p3=new Product("白酒",5,4);
    p.add(p1);
    p.add(p2);
    p.add(p3);
}

private static void enterMenu(){
    System.out.println("~~欢迎进入京东商城~~");
    System.out.println("\t1、添加商品");
    System.out.println("\t2、查看所有商品");
    System.out.println("\t3、查看指定标号的商品");
    System.out.println("\t4、添加到购物车");
    System.out.println("\t5、显示购物车");
    System.out.println("\t6、删除商品");
    System.out.println("\t7、修改商品中的库存");
    System.out.println("\t8、退出");
    System.out.println("~~~~~~~~~~~~~");
    System.out.println("请选择菜单");
    int chose=input.nextInt();
    switch(chose){
        case 1:add();break;
        case 2:look();break;
        case 3:add();break;
        case 4:add();break;
        case 5:add();break;
        case 6:add();break;
        case 7:add();break;
        case 8:add();break;
       }
}
private static void add(){
    System.out.println("请输入要添加商品名字");
    String addName=input.next();
    System.out.println("请输入要添加商品的价格");
    double addPrice=input.nextDouble();
    System.out.println("请输入要添加商品的数量");
    int addSales=input.nextInt();
int index=-1;//这句话不懂,只是一个初始值吧，没有任何实际意义。
for(int i=0;i<p.size();i++){
if(addName.equals("可乐")||addName.equals("啤酒")||addName.equals("白酒")){
index=1;
break;
}else{
    index=2;
}
}
if (index==2){
    System.out.println("添加成功");
    p.add(new Product(addName,addPrice,addSales));
    look();
}
else {
    System.out.println("添加失败");
}
}

private static void look(){
    System.out.println("商品名称\t商品价格\t商品数量");
//    遍历商品
    Iterator it=p.iterator();
    while(it.hasNext()){
        Product p0=(Product)it.next();
        System.out.println(p0.getName()+"\t"+p0.getPrice()+"\t"+p0.getSales());
    }
}

//查看指定标号的商品
    private static void search(){
        System.out.println("请输入商品名称");
        String name=input.next();
        int index=-1;
        for (int i=0;i<p.size()-1;i++){
            if (name.equals(p.get(i))){
                index=i;
                break;
            }
        }
        System.out.println("商品名称\t商品价格\t商品数量");
    }
//添加到购物车
    private static void addgouwu(){
        System.out.println("请输入要添加到购物车商品的名字");
        String name=input.next();
        System.out.println("请输入要添加到购物车商品的数量");
        int sales=input.nextInt();
        int index=-1;
        for(int i=0;i<p.size();i++){
            if (name.equals(p.get(i).getName())){
                index=i;
            }
        }
        double price=p.get(index).getPrice();
        newp.add(new Product(name,price,sales));
        System.out.println("添加成功");
        enterMenu();
    }
//    显示购物车
    private static void showgouwu(){
        System.out.println("购物车中的商品");
        System.out.println("商品名称\t商品价格\t商品数量");
//        对购物车中商品进行遍历
        Iterator it=newp.iterator();
        while(it.hasNext()){
            Product newp=(Product) it.next();
            System.out.println(newp.getName()+"\t"+newp.getPrice()+"\t"+newp.getSales());
        }
    }
    //删除商品
    private static void deletGoods(){
        System.out.println("请输入要删除商品的名称");
        String name=input.next();
        int index=-1;
        for (int i = 0; i <p.size(); i++) {
            if (name.equals(p.get(i).getName())){
                index=i;
            }
        }
        p.remove(index);
        System.out.println("删除成功");
        look();
    }
    //修改商品中的库存
    private static void updateGoodsSales(){
    look();
        System.out.println("先输入要修改商品的名字");
        String name=input.next();
        System.out.println("请输入库存数量");
        int sales=input.nextInt();
        int index=-1;
        for (int i = 0; i <p.size() ; i++) {
            if (name.equals(p.get(i).getName())){
                index=i;
            }
        }
        p.get(index).setSales(sales);
        look();
    }
    public static void main(String[] args) {
        do {
            enterMenu();
        }while(true);
    }
}
