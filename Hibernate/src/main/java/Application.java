import com.prateek_gupta.utils.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        // Initializing Scanner
        Scanner scanner = new Scanner(System.in);
        byte userChoice;
        char userWish;

        // Initializing src.java.Dao
        Dao dao = new DaoImpl();

        Table1Entity table1;

        SessionFactory factory = SessionFactoryUtil.getFactory();

        do {
            System.out.println(
                    "Enter\n"+
                    "1. Add data\n"+
                    "2. Read data\n"+
                    "3. Update data\n"+
                    "4. Delete data\n");
            userChoice = scanner.nextByte();
            scanner.nextLine();
            switch (userChoice){
                case 1:
                    table1=new Table1Entity();
                    System.out.println("Enter id");
                    table1.setId(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Enter name");
                    table1.setName(scanner.nextLine());

                    if (dao.save(factory,table1))
                        System.out.println("Data added successfully");
                    else
                        System.out.println("Data addition failed");
                    break;

                case 2:
                    dao.read(factory);
                    break;

                case 3:
                    table1=new Table1Entity();
                    System.out.println("Enter id to be updated");
                    table1.setId(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Enter updated name");
                    table1.setName(scanner.nextLine());

                    if (dao.update(factory,table1))
                        System.out.println("Data updated successfully");
                    else
                        System.out.println("Data update failed");
                    break;
            }

            System.out.println("Enter Y/y to continue or any other letter to exit");
            userWish=scanner.nextLine().charAt(0);
        }while (userWish=='Y'||userWish=='y');

        if (factory!=null)
            SessionFactoryUtil.closeFactory();
    }
}
