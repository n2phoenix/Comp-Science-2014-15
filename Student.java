import java.util.*;
class Student
{
    int n = 5;
    float tot[] = new float [n];
    String stud[] = new String [n];
    
    void readDetails()
    {
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < n; i++)
        {
            System.out.println ("Enter name " + (i + 1));
            stud[i] = in.nextLine();
            System.out.println ("Enter marks for " + stud[i]);
            tot[i] = Float.parseFloat (in.nextLine());
        }
    }
    
    void printResults()
    {
        System.out.println ("Highest scorer: " + stud[0]);
        System.out.println ("Marks: " + tot[0]);
        
        System.out.println ("Lowest scorer: " + stud[n - 1]);
        System.out.println ("Marks: " + tot[n - 1]);
    }
}