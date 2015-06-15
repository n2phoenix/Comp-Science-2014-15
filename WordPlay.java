import java.util.*;
class WordPlay
{
    String text = new String();
    String[] word;
    int count;

    void accept()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter string: ");
        text = in.nextLine();
        text = text.trim();
        text += " ";
        word = text.split(" ");    //Function to "split" words in a string separated by spaces into an array
    }

    void count_freq()
    {
        for (int i = 0; i < word.length; i++)
        {
            char c = word[i].charAt (0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;

            else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                count++;
        }
    }

    void arrange()
    {
        for (int i = 0; i < word.length; i++)
        {
            char c = word[i].charAt (0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                word[i] = reverse (word[i]);

            else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                word[i] = reverse (word[i]);

            else
                word[i] = word[i].toLowerCase();
        }
    }

    void display()
    {
        for (int i = 0; i < word.length; i++)
        {
            System.out.println (word[i]);
        }
        
        System.out.println();
        arrange();
        
        for (int i = 0; i < word.length; i++)
        {
            System.out.println (word[i]);
        }
    }
    
    String reverse (String s)
    {
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--)
            a += s.charAt (i);

        return a;
    }
}