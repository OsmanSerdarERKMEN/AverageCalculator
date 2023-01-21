import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int math, physics, chemistry, english, history, music;

        System.out.println("Math Grade: ");
        math = input.nextInt();

        System.out.println("Physics Grade: ");
        physics = input.nextInt();

        System.out.println("Chemistry Grade: ");
        chemistry = input.nextInt();

        System.out.println("English Grade: ");
        english = input.nextInt();

        System.out.println("History Grade: ");
        history = input.nextInt();

        System.out.println("Music Grade: ");
        music = input.nextInt();

        int courseCounter=0;
        int totalGrade=0;
        int [] grade=new int[]{math,physics,chemistry,english,history,music};

        for (int i = 0; i < grade.length ; i++) {
            if (grade[i]<=100 && grade[i]>=0)
            {
                courseCounter++;
                totalGrade+=grade[i];
            }
        }
        double coursesAverage=totalGrade/courseCounter*1.0;
        System.out.println(coursesAverage>=55? "Pass":"Failed");
    }
}