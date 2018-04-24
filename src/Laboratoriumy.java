import javax.swing.*;

public class Laboratoriumy {
    public static void main(String[] args)
    {
        String s;
        s="";
        for (int i=1;i<=10;i++)
        {
            for (int j=1;j<=10;j++)
            {
//                System.out.print(i*j);
                System.out.printf("%5d " ,(i*j));
                if (((i*j)>=10)&&((i*j)<100))
                    s+="  ";
                            else if((i*j)>=100)
                                 s+=" ";
                                         else
                                             s+="     ";
                s+=String.valueOf(i*j);
            }
                s+="\n";
            System.out.println();
        }

        JOptionPane.showMessageDialog(null,s);

    }
}
