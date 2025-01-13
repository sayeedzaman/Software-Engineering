import java.util.ArrayList;

public class Employee implements IEmployee{

    private String name;
    private String company;
    private String designation;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    private String projectName ;
    private ArrayList<IEmployee> subordinate = new ArrayList<IEmployee>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public ArrayList<IEmployee> getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(ArrayList<IEmployee> subordinate) {
        this.subordinate = subordinate;
    }


    public Employee(String name, String company,String projectName ,String designation){
        this.name = name;
        this.company = company;
        this.designation = designation;
        this.projectName = projectName;
    }
    @Override
    public String Project(String name) {
        return getProjectName();
    }

    @Override
    public String SoftwareComapny(String name) {
        return company;
    }

    public void addSubordinate(IEmployee employee){
        subordinate.add(employee);
    }
    public void removeSubordinate(IEmployee employee){
        subordinate.remove(employee);
    }
    public ArrayList<IEmployee> getChild(){
        return getSubordinate();
    }
}
