import org.prateekgupta.dto.UserDTO;
import org.prateekgupta.service.Service;
import org.prateekgupta.service.ServiceImpl;

import java.util.Scanner;

public class Facebook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        byte userChoice;
        char userWish;
        do {
            System.out.println("""
                    Enter
                    1. To register a user""");
            userChoice= scanner.nextByte();
            scanner.nextLine();
            switch (userChoice){
                case 1->{
                    UserDTO dto=new UserDTO();
                    System.out.println("Enter id of the user");
                    dto.setId(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Enter name of the user");
                    dto.setName(scanner.nextLine());
                    System.out.println("Enter email of the user");
                    dto.setEmail(scanner.nextLine());
                    System.out.println("Enter date of birth of the user");
                    dto.setDob(scanner.nextLine());
                    System.out.println("Enter gender of the user");
                    dto.setGender(scanner.nextLine());
                    Service service=new ServiceImpl();
                    System.out.println(service.validateAndSave(dto));
                }
            }
            System.out.println("Enter Y/y to continue or any other character to exit");
            userWish=scanner.nextLine().charAt(0);
        }while (userWish=='Y'||userWish=='y');
    }
}
