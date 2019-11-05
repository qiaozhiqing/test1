import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class ListTest {
// 创建一个list
public List courseToSelect;
public ListTest(){
   this.courseToSelect=new ArrayList();
    }
    public void testAdd(){
    Course cr1=new Course("1","数据结构");
    courseToSelect.add(cr1);
    Course temp =(Course) courseToSelect.get(0);
    System.out.println("添加了课程"+temp.id+":"+temp.name);

    Course cr2=new Course("2","C语言");
    courseToSelect.add(cr2);
    Course temp2=(Course) courseToSelect.get(0);
    System.out.println("添加了课程："+temp2.id+":"+temp2.name);

    courseToSelect.add(cr1);
    Course temp0=(Course) courseToSelect.get(2);
    System.out.println("添加了课程："+temp0.id+":"+temp0.name);

    Course[] course={new Course("3","离散数学"),new Course("4","汇编语言")};
    courseToSelect.addAll(Arrays.asList(course));
    Course temp3=(Course) courseToSelect.get(3);
    Course temp4=(Course) courseToSelect.get(4);
    System.out.println("添加了两门课程："+temp3.id+":"+temp3.name+","+temp4.id+":"+temp4.name);
//获取list中的元素

     }
 public void testGet(){
  int size=courseToSelect.size();
  for (int i=0;i<size;i++){
   Course temp=(Course) courseToSelect.get(i);
   System.out.println("第"+i+"门课程："+temp.id+":"+temp.name);
  }
}
public void testIterator(){
// Iterator需要查询一下这个是用来干嘛的
 Iterator it=courseToSelect.iterator();
 System.out.println("有如下待选课程（通过迭代器访问）：");
 while(it.hasNext()){
  Course cr=(Course) it.next();
  System.out.println("课程："+cr.id+":"+cr.name);
 }
 }

 public void testForEach(){
  System.out.println("有如下待选课程（通过for each访问）：");
  for (Object object:courseToSelect){
   Course cr=(Course) object;
   System.out.println("课程："+cr.id+":"+cr.name);
  }
 }
public void testModify(){
 Course cr=(Course) courseToSelect.set(4,new Course("7","毛概"));
 System.out.println("被修改课程："+cr.id+":"+cr.name);
}
public void testRemove(){
 Course cr=(Course) courseToSelect.get(4);
 System.out.println("将要被删除的课程是4和5位置上的课程：");
 Course[] crs={(Course) courseToSelect.get(4),(Course) courseToSelect.get(5)};
courseToSelect.removeAll(Arrays.asList(crs));
 System.out.println("已删除");
testForEach();
}
public void testType(){
 System.out.println("能否往list中添加一些奇怪的东西呢？");
 courseToSelect.add("我不是课程，只不过是一个字符串罢了");
}

 public static void main(String[] args) {
  ListTest It=new ListTest();
  It.testAdd();
  It.testGet();
  It.testIterator();
  It.testForEach();
  It.testModify();
  It.testForEach();
  It.testRemove();
  It.testType();
  It.testForEach();
 }
}







































