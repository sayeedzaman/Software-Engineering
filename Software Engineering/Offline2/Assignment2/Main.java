import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
        ExamControllerOffice examControllerOffice = new ExamControllerOffice();  // mediator

        List<Examiner> examiners = new ArrayList<>();
        List<Examinee> examinees = new ArrayList<>();

        Scanner scn = new Scanner(System.in);

        System.out.print("enter examiner number: ");
        int examinerNum = scn.nextInt();
        System.out.print("enter examinee number: ");
        int examineeNum = scn.nextInt();

        if((examinerNum > examineeNum) || (examinerNum < 1) || (examineeNum < 1)) {
            System.out.println("\n"+"input not accepted, exiting...");
            return ;
        }

        for(int i=0; i<examinerNum; i++) {
            examiners.add(new Examiner(examControllerOffice, i+1));
        }

        for(int i=0; i<examineeNum; i++) {
            examinees.add(new Examinee(examControllerOffice, i+1));
        }

        examControllerOffice.setExaminers(examiners);
        examControllerOffice.setExaminees(examinees);


        List<List<ExamScript>> arrayExamScripts = new ArrayList<>();
        List<ExamScript> temp;

        for(int i=0; i<examinerNum; i++) {
            temp = new ArrayList<>();
            arrayExamScripts.add(temp);
        }

        for(int i=0, examinerCount=0; i<examineeNum; i++) {
            if(examinerCount >= examinerNum) {
                examinerCount = 0;
            }

            arrayExamScripts.get(examinerCount).add(new ExamScript(examinerCount+1, i+1, random.nextInt(51)+50));  // NOTICE: marks between 50 and 100
            examinerCount++;
        }

        for(int i=0; i<examinerNum; i++) {
            System.out.println("");
            examiners.get(i).sendExamPackage(arrayExamScripts.get(i));
        }

        while(true) {
            System.out.print("\n" + "enter examinee id for reexamination(0 to exit): ");
            int id = scn.nextInt();

            if (id == 0) {
                break;

            } else if (id < 1 || id > examineeNum) {
                System.out.println("\n" + "invalid id given, try again...");

            } else {
                examinees.get(id-1).requestReexamination();
            }
        }

        return ;
    }
}