import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
class lab2 {
    public static void main(String[] args) {
        Scanner input_function = new Scanner(System.in);
        System.out.println("enter the function you want to do 1.add, 2.search ,3.remove ");
        Integer number = Integer.parseInt(input_function.nextLine());
        String[] Name = {"prashant","nishant","darvesh","kapil","ashish"};
        switch (number) {
            case 1:
                Integer number_of_names = Integer.parseInt(input_function.nextLine());
                for (int i = 0; i <= number_of_names; i++) {
                    System.out.println("enter the name you want to add:");
                    String user_name = input_function.nextLine();
                    ArrayList<String> name = new ArrayList<>();
                    name.add(user_name);
                    System.out.print("Name list: " + "=" + name);
                }
            break;
            case 2:
                String search_name = input_function.nextLine();
                for (int i=0;i<Name.length;i++){
                    if (search_name==Name[i]){
                        System.out.println("you name is search list " + search_name);
                        break;
                    }
                    else {
                        System.out.println("the name you search for is not in list!!!!!!!");
                    }
            }
            break;
            case 3:
                System.out.println("enter the name you want to remove from the array list");
                String remove_name = input_function.nextLine();
                for (int i= 0;i<Name.length;i++){
                    if (remove_name==Name[i]){
                        Name[i] = "Null";
                        Name[4] = "Null";
                    }
                }
                System.out.println(Name);
            break;
        }

    }
}