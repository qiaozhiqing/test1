import java.util.Set;
import java.util.TreeSet;

public class Demoset {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wanger");
        set.add("mazi");
        System.out.println(set);
//        添加重复的元素
        set.add("zhangsan");
        System.out.println(set);
//        删除
        set.remove("mazi");
        System.out.println(set);
        System.out.println(set.size());
    }
}
