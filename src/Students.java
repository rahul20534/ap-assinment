import java.util.Scanner;

public class Students implements DisscussionForum{
private Lectures ls;
private Assessment sa;

    @Override
    public void addComments(String com) {

    }

    @Override
    public void viewComments() {

    }

    public void viewLectureMaterials(){

    }

    public void viewAssessments(){

    }
    public void submitAssessment(){

    }

    public void viewGrades(){

    }

    public void Logout(){
        new CoursePage();
    }

    Students(){
        System.out.println("Students: \n" +
                "0 - S0 \n" +
                "1 - S1 \n" +
                "2 - S2 \n" +
                "Choose id:  \n");
        Scanner in=new Scanner(System.in);
int id=in.nextInt();
if(id==0 || id==1 || id==2) {
    while(true) {
        System.out.println("Welcome S0  \n1. View lecture materials \n" +
                "2. View assessments \n" +
                "3. Submit assessment \n" +
                "4. View grades \n" +
                "5. View comments \n" +
                "6. Add comments \n" +
                "7. Logout");
        int id1=in.nextInt();
        if(id1==7){
            Logout();
        }
    }
}
    }
}


