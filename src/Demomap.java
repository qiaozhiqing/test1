import java.util.Map;
import java.util.TreeMap;

public class Demomap{
    public static void main(String[] args) {
        Map<String,String> map=new TreeMap<>();
//      添加
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");
        map.put("4","value4");
        map.put("5","value5");
        map.put("6","value6");
        System.out.println(map);
//        删除
        map.remove("6");
        System.out.println(map);
//        修改
        map.put("1","qiaozhiqing");
        System.out.println(map);
//        遍历
//        方法1
        for(String key:map.keySet()){
            System.out.println("key="+key+":"+"value="+map.get(key));
        }
//        方法2
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}