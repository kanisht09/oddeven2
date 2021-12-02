import java.io.*;
class QUIZ
{
    int m,s[];
    char u[][],k[];
    QUIZ()
    {
        m=0;
        k=new char [5];
    }

    void accept()throws IOException
    {
        int i,j,C=0;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("ENTER NUMBER OF PARTICIPANTS");
        do
        {
            m=Integer.parseInt(in.readLine());
            if(m<3||m>11)
                System.out.println("RE-ENTER");
        }while(m<3||m>11);
        u= new char[m][5];
        s= new int[m];
        System.out.println("ENTER THE KEY");
        for(i=0;i<5;i++)
            k[i]=(char)(in.read());
        System.out.println("ENTER THE ANSWERS");
        for(i=0;i<m;i++)
        {
            System.out.println("PATICIPANT:"+(i+1));
            for(j=0;j<5;j++)
            {
                u[i][j]=(char)(in.read());
            }
        }
    }

    int match(int a[])
    {
        int i,j,c=0;
        for(i=0;i<5;i++)
        {
            if(a[i]==k[i])
                c++;
        }
        return c;
    }

    void scores()
    {
        int a[]=new int[5];
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<5;j++)
                a[j]=u[i][j];
            s[i]=match(a);
        }
    }

    void highest()
    {
        int i,z=0,max=0,C=0;
        for (i=0;i<m;i++)
        {
            System.out.println("PARTICIPANT"+(i+1)+":"+s[i]);
            if(s[i]>max)
            {
                max=s[i];
                z=i;
            }
        }
        System.out.println("HIGHEST SCORE :"+max+"PARTICIPANT :"+(z+1));
    }

    public static void main (String args[])throws IOException
    {
        QUIZ ob=new QUIZ();
        ob.accept();
        ob.scores();
        ob.highest();
    }
}
