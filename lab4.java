import java.util.*;

class lab4{
    static int Account_Number = 221222036;
    static String Account_Holder_Name = "prashant";
    static int Account_Balance = 10000;
    static Scanner my_object = new Scanner(System.in);
    static int user_choice = Integer.parseInt(my_object.nextLine());

    static String initialize_customer(String m){
        System.out.println("enter the user_name ");
        String user_name = my_object.nextLine();
        if (Account_Holder_Name==user_name.toLowerCase()){
            int account = Integer.parseInt(my_object.nextLine());
            if (Account_Number==account);
            System.out.println(" customer is initilize");
        }
        return m;
    }

    static int deposit_money( int depo_money){
        Account_Balance = depo_money + Account_Balance;
        System.out.println("last money you have deposit: " + depo_money);
        return Account_Balance;
    }

        static int withdraw_money(int money_withdraw){
            if (Account_Balance<money_withdraw){
                System.out.println("you balance is not sufficient to withdraw money Sorry for inconvinence");
            }
            else {
                Account_Balance = Account_Balance - money_withdraw;
            }
            System.out.println("last money you have withdraw is : " + money_withdraw);
            return Account_Balance;
        }


    static int[] print_tranction() {
    int my_trancton[] = new int[2];
    my_trancton[0] = deposit_money(1100);
    my_trancton[1] = withdraw_money(500);
    return my_trancton;
    }
    static String account_summary(String z){
        System.out.println("Account Name : " + Account_Holder_Name);
        System.out.println("Account number : " + Account_Number);
        System.out.println("Current balance: " + Account_Balance);
        print_tranction();
        return z;
    }
    public static void main(String[] args){

    System.out.println("Welcome Customer: ");
    System.out.println("what kind of process you want to do: ");
    System.out.println("1.deposit, 2.withdraw, 3.transction, 4.summary");
    while (true) {
            switch (user_choice) {
                case 1:
                    String customer_name = "prashant";
                    initialize_customer(customer_name);
                    break;
                case 2:
                    System.out.println("how much you want to deposit: ");
                    int x = my_object.nextInt();
                    break;
                case 3:
                    System.out.println("how much money you want to withdraw; ");
                    int y = my_object.nextInt();
                    withdraw_money(y);
                    break;
                case 4:
                    print_tranction();
                    break;
                case 5:
                    String my_summary = "this is my summary";
                    account_summary(my_summary);
                    break;


            }
        }
    }
}