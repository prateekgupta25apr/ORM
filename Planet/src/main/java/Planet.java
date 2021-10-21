import org.prateekgupta.dao.PlanetDAO;
import org.prateekgupta.dao.PlanetDAOImpl;
import org.prateekgupta.entity.PlanetEntity;

import java.util.Scanner;

public class Planet {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        byte userChoice;
        char userWish;
        do {
            System.out.println("""
                    Enter
                    1. To add details of a planet
                    2. To get details of a planet by id
                    3. To update details of a planet
                    4. To delete details of a planet""");
            userChoice=scanner.nextByte();
            scanner.nextLine();
            switch (userChoice){
                case 1->{
                    PlanetDAO dao=new PlanetDAOImpl();
                    PlanetEntity planet=new PlanetEntity();
                    System.out.println("Enter id for the planet");
                    planet.setId(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Enter name of the planet");
                    planet.setName(scanner.nextLine());
                    System.out.println(dao.save(planet));
                }
                case 2->{
                    System.out.println("Enter id for the planet");
                    PlanetDAO dao=new PlanetDAOImpl();
                    dao.getById(scanner.nextInt());
                    scanner.nextLine();
                }
                case 3->{
                    PlanetDAO dao=new PlanetDAOImpl();
                    PlanetEntity planet=new PlanetEntity();
                    System.out.println("Enter id for the planet");
                    planet.setId(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Enter name of the planet");
                    planet.setName(scanner.nextLine());
                    System.out.println(dao.update(planet));
                }
                case 4->{
                    System.out.println("Enter id for the planet");
                    PlanetDAO dao=new PlanetDAOImpl();
                    System.out.println(dao.delete(scanner.nextInt()));
                    scanner.nextLine();
                }
            }
            System.out.println("Enter Y/y to continue or any other character to exit");
            userWish=scanner.nextLine().charAt(0);
        }while (userWish=='Y'||userWish=='y');
    }
}
