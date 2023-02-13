import java.util.*;
 public class lab3{

    static ArrayList<String> Student_detail(){
        Scanner my_detail = new Scanner(System.in);
        ArrayList<String> Student_det =  new ArrayList<String>();
        System.out.println("enter how student detail you want to enter : ");
        Integer number = Integer.parseInt(my_detail.nextLine());
        for (Integer i=0;i<number;i++){
            System.out.println("enter the name");
            String name = my_detail.nextLine();
            System.out.println("enter the reg no");
            String reg_no = my_detail.nextLine();
            System.out.println("enter the email");
            String email = my_detail.nextLine();
            System.out.println("enter the class");
            String classes = my_detail.nextLine();
            System.out.println("enter the department");
            String department = my_detail.nextLine();
            Student_det.add(name);
            Student_det.add(reg_no);
            Student_det.add(email);
            Student_det.add(classes);
            Student_det.add(department);
        }
    System.out.println(Student_det);
    return Student_det;
    }
    public static void main(String[] args){
        Student_detail();
    }
}
