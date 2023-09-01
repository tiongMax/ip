import java.util.Scanner;

public class Ui {

    public void welcomeMessage() {

        String logo = "\t ____        _        \n"
                + "\t|  _ \\ _   _| | _____ \n"
                + "\t| | | | | | | |/ / _ \\\n"
                + "\t| |_| | |_| |   <  __/\n"
                + "\t|____/ \\__,_|_|\\_\\___|\n";

        System.out.println("\tHello from\n" + logo);
        System.out.println(showLine());
        System.out.println("\t Hello! I'm YOLO \n\t What can I do for you? \n");
        System.out.println(showLine());
        System.out.println();
    }

    public void farewell() {

        System.out.println(showLine());
        System.out.println("\t Bye. Hope to see you again soon! \n");
        System.out.println(showLine());
    }

    public static String showLine() {
        return "\t---------------------------------------------------------------------------";
    }

    public String readCommand() {

        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}