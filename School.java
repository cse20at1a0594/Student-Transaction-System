class Stu{
String name,branch;
int amt,rollno;
void Sshow(){
System.out.println("Student name: "+name);
System.out.println("Student Amt: "+amt);
System.out.println("Student roll : "+rollno);
System.out.println("Student branch : "+branch);
}}
class Stationary{
    String name,books,pens;
    int amt,book,pen;
    void show(){
        System.out.println("Seller name: "+name);
         System.out.println("Total amount: "+amt);
         System.out.println("books: "+books);
         System.out.println("pens: "+pens);
         System.out.println("no of books: "+book);
         System.out.println("no of pens: "+pen);
    }

    
    void Amt(Stu x)
    {
     amt+=500;
    x.amt-=500;
    }

}
class Library{
    String Manager,Author,name;
    int amt,Edition;
    void show(){
     System.out.println("Name Of Manager: "+Manager);
     System.out.println("Book Name: "+name);
     System.out.println("Edition No: "+Edition);
     System.out.println("Name Of Author: "+Author);

     System.out.println("Amt: "+amt);   
    }
    void sell(Stu x){
     amt+=1200;
     x.amt-=1200;
    }
}
class Accounter{
String name;
int sal;

void Ashow(){
System.out.println("Acc name: "+name);
System.out.println("Acc sal: "+sal);
}
void fee(Stu x){
sal+=1000;
x.amt-=1000;

}
}
class Canteen{
    String name,drinks,meals;
    int price,amt;
    void show(){
        System.out.println("Name Of The Seller: "+name);
         System.out.println("Name Of Drinks: "+drinks);
          System.out.println("Name Of Meals: "+meals);
         System.out.println("Person Income: "+amt);
         System.out.println("Total Amount: "+price);
    }
    void sell(Stu x)
    {
      amt+=200;
     x.amt-=200;

    }
}  
class School{
public static void main(String arg[]){
Stu s=new Stu();
Accounter a=new Accounter();
Stationary sa =new Stationary();
Library l=new Library();
Canteen c=new Canteen();

s.name="Nancy";
s.branch="CSE";
s.rollno=594;
s.amt=5000;
a.name="Prasad";
a.sal=0;

sa.name="Naveen";
sa.amt=5000;
sa.books="Ethics and Human Values";
sa.pens="Glitter";
sa.book=1;
sa.pen=5;
c.name="Glory";
c.drinks="Soda";
c.meals="Biriyani";
c.price=200;
c.amt=400;


l.Manager="Sreekar";
l.amt=5000;
l.Author="Pressmen";
l.name="Softwrae Engineering";
l.Edition=7;
System.out.println("STUDENT DETAILS");
s.Sshow();
System.out.println("\nACCOUNTER DETAILS");
a.Ashow();
a.fee(s);
System.out.println("\nSTATIONARY DETAILS");
sa.show();
sa.Amt(s);
System.out.println("\nLIBRARYDETAILS");
l.show();
l.sell(s);
System.out.println("\nCANTEEN DETAILS");
c.show();
c.sell(s);
System.out.println("\nAFTER PAYING AMOUNT");
System.out.println("STUDENT DETAILS");
s.Sshow();
System.out.println("\nACCOUNTER DETAILS");
a.Ashow();
System.out.println("\nSTATIONARY DETAILS");
sa.show();
System.out.println("\nLIBRARYDETAILS ");
l.show();
System.out.println("\nCANTEEN DETAILS");
c.show();
}}

