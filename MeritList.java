class MeritList extends Student
{
    void generateMeritList()
    {
        readDetails();
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (tot[i] < tot[j])
                {
                    String ts = stud[i];
                    stud[i] = stud[j];
                    stud[j] = ts;
                    
                    float tf = tot[i];
                    tot[i] = tot[j];
                    tot[j] = tf;
                }
            }
        }
    }
    
    void printMeritList()
    {
        printResults();
        System.out.println ("Name \t Marks");
        
        for (int i = 0; i < n; i++)
        System.out.println (stud[i] + " \t " + tot[i]);
    }
}