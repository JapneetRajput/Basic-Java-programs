import java.util.*;
public class shopping
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str;
Vector<String> v=new Vector<String>();
int i;
int choice=0;
System.out.println("Enter 5 elements");
for(i=0;i<=4;i++)
{
str=sc.next();
v.addElement(str);
}
while(choice!=4)
{
System.out.println("1.add element\n2.delete element3.display list\n 4.exit\nenter your choice");
choice=sc.nextInt();
switch(choice)
{
case 1: System.out.println("Enter element");
       str=sc.next();
       v.addElement(str);
        break;
case 2: System.out.println("Enter element");
       str=sc.next();
       v.removeElement(str);
       break;
case 3: System.out.println("Enter Element");
      int index=sc.nextInt();
      System.out.println("Name="+v.elementAt(index));
       break;
case 4:break;
}
System.out.println("The current list:");
for(i=0;i<=v.size()-1;i++)
{
System.out.println(v.elementAt(i));
}
}
}
}
