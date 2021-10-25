import java.util.Scanner;

public class Instructor implements DisscussionForum{
private Lectures li;
private Assessment ai;

public void addClassMaterial(String video,String slide){
li.videos.add(video);
li.slides.add(slide);
    System.out.println("matterials have been added\n");
}

public void addAssessments(String assignment, String quiz, int maxMarks){
ai.assignments.add(assignment);
ai.quizzes.add(quiz);
ai.maxMarks.add(maxMarks);
ai.closeStatus.add(true);
}

public void viewLectureMaterials(){
    System.out.println("Lecture slides:\n");
    for(int i=0;i<li.slides.size();i++){
        System.out.println(li.slides.get(i)+"\n");
    }
    System.out.println("\n Video Lectures:\n");
    for(int i=0;i<li.videos.size();i++){
        System.out.println(li.videos.get(i)+"\n");
    }
}

public  void viewAssessments(){
    System.out.println("Assignments: \n");
    for(int i=0;i<ai.assignments.size();i++){
        System.out.println(ai.assignments.get(i)+" "+ai.maxMarks.get(i)+" "+ai.closeStatus.get(i));
    }
    System.out.println("\n Quizzes: \n");
    for(int i=0;i<ai.quizzes.size();i++){
        System.out.println(ai.quizzes.get(i)+" ");
    }
}

public void gradeAssessments(){
    System.out.println("press 1 to grade assignments or\n press 2 to grade quizzes:\n");
    Scanner in=new Scanner(System.in);
    int st=in.nextInt();

}

public void closeAssessment(){

}

@Override
public void viewComments(){
    System.out.println("Comments are as follows:\n");
    for(int i=0;i<ai.comments.size();i++){
        System.out.println(ai.comments.get(i)+"\n");
    }
}

@Override
public void addComments(String comment){
ai.comments.add(comment);
    System.out.println("Comment added!\n");
}

public void Logout(){
    new CoursePage();
}

    Instructor(){
    li=new Lectures();
    ai=new Assessment();
        System.out.println("Instructors: \n" +
                "0 - I0 \n" +
                "1 - I1 \n" +
                "Choose id:  \n");
        Scanner in=new Scanner(System.in);
        int id=in.nextInt();
        if(id==0 || id==1 || id==2) {
            while(true){
            System.out.println("Welcome I0 " +
                    "1. Add class material \n" +
                    "2. Add assessments \n" +
                    "3. View lecture materials \n" +
                    "4. View assessments \n" +
                    "5. Grade assessments \n" +
                    "6. Close assessment \n" +
                    "7. View comments \n" +
                    "8. Add comments \n" +
                    "9. Logout \n");
            int id1 = in.nextInt();
            if (id1 == 1) {
                System.out.println("enter video file name:");
                String video = in.next();
                System.out.println("enter slide name:");
                String slide = in.next();
                addClassMaterial(video, slide);
            }
            if (id1 == 2) {
                System.out.println("Enter assignment description:\n");
                String assignment = in.nextLine();
                in.nextLine();
                System.out.println("enter the quiz description:\n");
                String quiz = in.nextLine();
                in.nextLine();
                System.out.println("Enter the maximum marks:\n");
                int marks = in.nextInt();
                addAssessments(assignment, quiz, marks);
            }
            if (id1 == 3) {
                viewLectureMaterials();
            }
            if (id1 == 4) {
                viewAssessments();
            }
            if (id1 == 5) {
                gradeAssessments();
            }
            if (id1 == 6) {
                System.out.println("assessment closed.\n");
                closeAssessment();
            }
            if (id1 == 7) {
                viewComments();
            }
            if (id1 == 8) {
                System.out.println("Enter comment:\n");
                String comment = in.nextLine();
                in.nextLine();
                addComments(comment);
            }
            if (id1 == 9) {
                Logout();
            }
        }
        }

    }

}

