import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void getSubOrdinate(IEmployee iemployee){
        if(iemployee instanceof Employee){
            Employee employee = (Employee) iemployee;
            ArrayList<IEmployee> employeesOfTheCompany = employee.getChild();
            for(IEmployee iEmployee : employeesOfTheCompany){
                if (iEmployee instanceof Employee){
                    Employee employeeObj = (Employee) iEmployee;
                    System.out.println("\t\t\t-" + employeeObj.getName() );
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("total companies in the row : ");
        int number_of_Companies = scn.nextInt();
        for (int i=0; i<number_of_Companies; i++){
            System.out.println("Name of the Company :");
            String company =scn.next();
            SoftwareCompany softwareCompany = new SoftwareCompany(company);
            //softwareCompany.addCompanies();
            System.out.println("Number of projects : ");
            int number_of_project = scn.nextInt();
            for(int j = 0; j < number_of_project; j++){
                System.out.println("Name of the Project :");
                String project = scn.next();
                System.out.println("Name of the Porject Manager : ");

                String name = scn.next();


                Employee manager = new Employee(name,company,project,"Project Manager");
                //Projects projects = new Projects(project,manager);
                //softwareCompany.addProjects(projects);
                System.out.println("Number of Supervisees : ");
                int numberOfSubordinates = scn.nextInt();
                for (int k = 0; k<numberOfSubordinates; k++){
                    String developerName = scn.next();
                    Employee developer = new Employee(developerName,company,project,"Developer");
                    manager.addSubordinate(developer);
                }
                System.out.println("\t -"+ manager.getCompany());
                System.out.println("\t\t-"+manager.getName()+"("+project+")");
                getSubOrdinate(manager);
            }
            /*System.out.println("");
            System.out.println("");
            System.out.println("\t-"+ softwareCompany.getCompanyName());
            System.out.println("\t-");*/
            //System.out.println("-"+company);
            //getSubOrdinate();

        }

    }
}