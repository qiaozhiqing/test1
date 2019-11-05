public class Course {
    public String id;
    public String name;
    public Course(){
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        if (id==""){
            System.out.println("请输入id");
        }else{
            this.id=id;
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name==""){
            System.out.println("请输入name");
        }else{
            this.name=name;
        }
    }
    public Course(String id,String name){
        this.setId(id);
        this.setName(name);
    }
}

















