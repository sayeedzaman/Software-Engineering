import java.util.ArrayList;

public class SoftwareCompany {
    private String companyName;
    private String projectName;
    private ArrayList<String>companies = new ArrayList<String>();

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setCompanies(ArrayList<String> companies) {
        this.companies = companies;
    }

    public ArrayList<String> getCompanies(){

        return companies;
    }

    public SoftwareCompany(String companyName){
        this.companyName = companyName;
        companies.add(companyName);
        //Projects projects =new Projects();
    }
    public void addProjects(Projects projects){
        projects.addProject(getProjectName());

    }



}
