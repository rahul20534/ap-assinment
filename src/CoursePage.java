import java.util.Scanner;

public class CoursePage {

    CoursePage(){
        System.out.println("Welcome to Backpack \n" +
                "1. Enter as instructor \n" +
                "2. Enter as student \n" +
                "3. Exit \n");
        Scanner in =new Scanner(System.in);
        int inp=in.nextInt();
        if (inp==1){
new Instructor();
        }
        else if(inp==2){
new Students();
        }
        else if(inp==3){
            System.out.println("Thanks for using BackPack");
            System.exit(0);
        }
        else{
            System.out.println("invalid Input!");
        }
    }


}
