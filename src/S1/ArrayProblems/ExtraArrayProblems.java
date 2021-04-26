package S1.ArrayProblems;


import java.util.Arrays;

public class ExtraArrayProblems {
    public static void main(String[] args) {
        String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);

        System.out.println("Ascend\tDescend");

        for(int i = 0; i < ss.length; i++)
        {
            System.out.println(ss[i] + "\t" + ss[ss.length - (i + 1)]);
        }


    }


}
