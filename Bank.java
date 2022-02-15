import java.util.Scanner;
public class Bank {
	 private int accno,bal;
     private String cname,addr;
     public void getValue()
     {
             Scanner sin=new Scanner(System.in);
             System.out.print("Enter the Customer name:");
             cname=sin.nextLine();
             System.out.print("Enter the Customer address: ");
             addr=sin.nextLine();
             System.out.print("Enter the accno:");
             accno=sin.nextInt();
             System.out.print("Enter the balance:");
             bal=sin.nextInt();
     }
     public void displayData()
     {

             System.out.println("Accno:"+accno);
             System.out.println("Customer name:"+cname);
             System.out.println("Customer address:"+addr);
             System.out.println("Balance amount:"+bal);
   }
     public void Deposit(int x)
     {
             bal+=x;
     }
     public int getAccno()
     {
             return accno;
     }
     public void withDraw(int x)
     {
             if(bal>x)
                     bal=bal-x;
             else
                     System.out.println("Ur balance is only "+bal);
     }
}
