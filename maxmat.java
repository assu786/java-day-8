import java.util.*;
class Finding
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        int max=a[0][0];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]>max)
                max=a[i][j];
            }
        }
        System.out.println(max);
    }
}