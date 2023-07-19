import java.util.Scanner;
class Student{
    int s_id;
    String s_name;
    Student(String name,int id){
        s_id=id;
        s_name=name;
    }   
}
class Sports extends Student{
    String sp_name;
    Sports(String name, int id, String s_name){
        super(name,id);
        sp_name=s_name;

    }
}
class Result extends Sports{
    String res;
    Result(String name, int id, String s_name, String result){
        super(name, id, s_name);
        res=result;   
    }

    void display5(){
        System.out.println("Student id" +s_id);
        System.out.println("student name"+ s_name);
        System.out.println("sports name "+sp_name);
        System.out.println("result"+ res);
    }
}

public class Co3_05 {
    public static void main(String[] args){
        int id;
        String name,s_name,result;
        Scanner s=new Scanner(System.in);
        System.out.println("student id ");
        id=s.nextInt();
        System.out.println("student name ");
        name=s.next();
        System.out.println("sports name ");     
        s_name=s.next();
        System.out.println("result ");
        result=s.next();

        Result obj = new Result(name,id, s_name,result);
        obj.display5();
    }
}
