import java.util.Scanner;

public class Employee{
    public static void main(String[] args){
        Scanner employee_detail = new Scanner(System.in);
        System.out.println("Enter employee in sequence given basic detail like name,state , company ,age,location, experience");
        String name = employee_detail.nextLine();
        String state = employee_detail.nextLine();
        String company = employee_detail.nextLine();
        Integer age = employee_detail.nextInt();
        employee_detail.nextLine();
        System.out.println("name: "+ name + "," + "age: "+ age + "," + "state: " + state);
        System.out.println("enter your preferable work location: ");
        String location = employee_detail.nextLine();
        System.out.println("please tell your gender m or f");
        String gender = employee_detail.nextLine();

    if ("/m".equals(gender)){
        System.out.println("Male");
    } else if ("f".equals(gender)) {
        System.out.println("Female");
    }
    else {
        System.out.println("ohh sorry be we have some problem");
    }
    String[] north = {"Delhi",
            "Haryana",
            "Jammu and Kashmir",
            "Himachal Pradesh",
            "Uttarpradesh",
            "Punjab",
            "Uttarakhand",
            "Rajasthan",
            "Ladakh",
            "Chandigarh"};
    String[] south = {"Andaman & Nicobar",
            "Andhra Pradesh",
            "Karnataka",
            "Kerala",
            "Lakshadweep",
            "Pondicherry",
            "Tamilnadu"};
    String[] west = {"PlayUnmute",
            "Daman & Diu",
            "Goa",
            "Gujarat",
            "Maharashtra",
            "Rajasthan"};
    String[] east = {"Bihar",
            "Jharkhand",
            "Orissa",
            "West Bengal"};
    switch(state){
            case "north":
                System.out.println("The Employee is from the northern states of India");
                break;
            case "South":
                System.out.println("The Employee is from the southern states of India");
                break;
            case "west":
                System.out.println("The Employee is from the western states of India");
                break;
            case "east":
                System.out.println("The Employee is from the eastern states of India");
                break;
        }
        /*Identify if the employee belongs to the top MNC Companies
        (Facebook, Google, Microsoft, Samsung, IBM, Apple); if so, print a message
        "The employee is working in Top MNC Companies".*/
        if ("/IBM".equals(company)) {
            System.out.println("The employee is working in Top MNC Companies");
        }
        else if ("/Facebook".equals(company)){
            System.out.println("The employee is working in Top MNC Companies");
        } else if ("/Microsoft".equals(company)) {
            System.out.println("The employee is working in Top MNC Companies");
        } else if ("/Apple".equals(company)) {
            System.out.println("The employee is working in Top MNC Companies");
        } else if ("/Samsung".equals(company)) {
            System.out.println("The employee is working in Top MNC Companies");
        } else if ("/Google".equals(company)) {
            System.out.println("The employee is working in Top MNC Companies");
        }

    }
}