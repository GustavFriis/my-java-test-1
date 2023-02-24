import assignment1.LogicsAndNumbersStuff;
import assignment1.StringHandler;
import assignment2.FlipCoin;
import assignment3.Team;
import assignment3.TeamMember;
import assignment4.Student;

public class Main {
    public static void main(String[] args) {
        LogicsAndNumbersStuff logicsAndNumbersStuff = new LogicsAndNumbersStuff();

        logicsAndNumbersStuff.diffMultipliedByC(9,4,6);
        logicsAndNumbersStuff.canYouStayInBed(true,false);
        int[] arr = new int[] {2,1,1,2,4,2,4,1,5};
        logicsAndNumbersStuff.sumOfNumbers(arr);
        logicsAndNumbersStuff.averageOfNumber(arr);
        logicsAndNumbersStuff.numberWithMostOccurrences(arr);

        StringHandler stringHandler = new StringHandler();

        String[] strArr = new String[] {"hello", "greetings"};
        stringHandler.stringManipulation("cacka");
        stringHandler.stringLength("hello");
        stringHandler.stringArrayLength(strArr);
        stringHandler.stringReverse("Hello");
        stringHandler.charCount("hello world", 'l');
        stringHandler.stringOfChars(4,'X');

        FlipCoin flipCoin = new FlipCoin();

        flipCoin.flipCoin();

        Team team = new Team();
        TeamMember gustav = new TeamMember(1,"Gustav","center");
        TeamMember gustav2 = new TeamMember(2,"Gustav","center");

        team.addTeamMember(gustav);
        team.addTeamMember(gustav);
        team.addTeamMember(gustav);
        team.addTeamMember(gustav2);
        team.removeTeamMember(gustav2);
        team.retriveMembersByRole("center");

        Student mads = new Student(1,"Mads");


    }
}
