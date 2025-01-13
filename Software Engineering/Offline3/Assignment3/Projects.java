import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.NavigableMap;

public class Projects {
    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ArrayList<String> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<String> projects) {
        this.projects = projects;
    }

    private ArrayList<String> projects = new ArrayList<String>();


    public  Projects(String Name , Employee employee){
        projects.add(Name);
        //employee.addSubordinate(employee);

    }
    public void addProject(String projectName){
        this.projectName = projectName;
        projects.add(projectName);
    }
    public void showProjects(){


    }

}
