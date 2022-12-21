import java.util.Scanner;

class student
{
    String usn,name,branch;
    long phone;
    public void display()
    {

        System.out.println("USN=" + usn);
        System.out.println("NAME=" + name);
        System.out.println("BRANCH" + branch);
        System.out.println("PHONE NO.=" + phone);
    }

}
public class studentdemo {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students");
        n=sc.nextInt();
        student[] st= new student[n];

            int i;
            for (i = 0; i < n; i++) {
                st[i] = new student();

            }

        for(i= 0; i<n ;i++)
        {
            System.out.println("Enter the details of students"+(i-1));
            System.out.println("Enter usn");
            st[i].usn=sc.next();
            System.out.println("Enter name");
            st[i].name=sc.next();
            System.out.println("Enter branch");
            st[i].branch=sc.next();
            System.out.println("Enter phone no.");
            st[i].phone=sc.nextLong();

        }
        for (i= 0; i<n; i++)
        {
            st[i].display();
        }
    }

}
