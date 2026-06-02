import java.util.Scanner;
public class Main {
        public static void main(String[] args){
                PasswordValidator pv = new PasswordValidator();
                String password;
                int flag;
                String choice;
                Scanner sc = new Scanner(System.in);
                do{
                        flag = 0;
                        if(flag !=0)
                                sc.nextLine();
                        System.out.print("Enter your password :: ");
                        password = sc.nextLine();

                        try {
                        pv.setPassword(password);
                        pv.validate();
                        }catch (WeakPasswordException e) {
                                System.out.println(e.getMessage());
                                System.out.println("Do you want to re-enter new password ?(y for Yes)");
                                choice = sc.nextLine();
                                if(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")){
                                        flag = 1;
                                }
                        }
                        
                }while(flag == 1);
                sc.close();
                System.out.println("Exiting....");
        }
}
