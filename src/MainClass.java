import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        DatabaseServices databaseServices = new DatabaseServices();
        Scanner s= new Scanner(System.in);
        int ch;

        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter Your Choice :");
            ch=s.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter EmpNo : ");
                    int eno = s.nextInt();
                    System.out.print("Enter EName : ");
                    String eName = s.nextLine();
                    System.out.print("Enter Salary : ");
                    Long salary = s.nextLong();

                   databaseServices.insertEmployee (new Employee(eno,eName,salary));

                    break;
                // this is Display SHow employee.
                case 2:
//                System.out.println(c);
                    System.out.println("............................");

                    System.out.println(".................................");
                    break;
                //This is Search for Emono
                case 3:
                    boolean found = false;
                    System.out.println("Enter Empno to Search :");
                    System.out.println("............................");

                    System.out.println(".................................");
                    break;
                //This is Search for Emono
                case 4:
                    found = false;
                    System.out.println("Enter Empno to Search :");
                    System.out.println(".................................");
                    break;
                case 5:
                    found = false;
                    System.out.println("Enter Empno to Update :");

                    System.out.println(".................................");
                    break;
            }
        } while (ch!=0);
    }
}
