
public class absolutedifference {
    public static int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++)
        {
            score+=Math.abs(s.charAt(i+1)-s.charAt(i));
        }
        return score;
    }
    public static void main(String[] args)
    {
        String s="abc";
        System.out.println(scoreOfString(s));
    }
}

