import java.util.Scanner;
class Bank
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Java Bank");
Banking b=new Banking();
b.getData();
int x;
do
{
System.out.print("\n1. Deposit Amount\n2. Withdraw Amount\n3. Display name and balance\n4. Exit\n\tEnter your choice : ");
x=sc.nextInt();
switch(x)
{
case 1:
b.deposit();
break;
case 2:
b.withdraw();
break;
case 3:
b.display();
break;
case 4:
System.exit(0);
break;
}
}while(x!=0);
}
}
class Banking
{
private String name;
private int number;
private String type;
private double balance;
Scanner sc=new Scanner(System.in);
public void getData()
{
System.out.print("Enter your name : ");
name = sc.nextLine();
System.out.print("Enter your account number : ");
number = sc.nextInt();
System.out.print("Enter your account type : ");
type= sc.next();
System.out.print("Enter your intial balance : ");
balance= sc.nextInt();
}
public void deposit()
{
System.out.print("Enter amount to deposit : ");
double x=sc.nextDouble();
balance+=x;
System.out.print("Current Balance is "+balance);
}
public void withdraw()
{
if(balance==0)
{
System.out.print("No balance left in account.");
return;
}
else
{
System.out.print("Enter amount to withdraw : ");
double with=sc.nextDouble();
if(with>balance)
System.out.print("Cannot withdraw. Current Balance is "+balance);
else
{
balance-=with;
System.out.print(with+" withdrawed. Current Balance is "+balance);
}
}
}
public void display()
{
System.out.println("Name = "+name+" Balance="+balance);
}
}