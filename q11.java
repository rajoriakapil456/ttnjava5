import java.util.Map;
public record Student (String name,Integer id ,Integer age)
{
    public static int oc = 0;
    public Student()
    {
        oc++;
    }
}
class Question_11 {
    public static void main(String[] args) 
    {
        Student st1=new Student("kapil",1,20);
        Student st2=new Student("saurabh",1,20);
        System.out.println(st2.equals(st1));
        System.out.println(Student.oc);
    }
}
