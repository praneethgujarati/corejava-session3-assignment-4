class Student
{
  private String name;
  private String name1;
  private String name2;
  private int rollno;
  private int rollno1;
  private int rollno2;
  
  private int m1;
  private int m2;
  private int m3;
  private int m11;
  private int m22;
  private int m33;
  private int m111;
  private int m222;
  private int m333;
  private double avg;
  private double avg1;
  private double avg2;
  


//setters and getters for student 1

  public String getName()
  {
    return name;

  }

  public int getRollno()
  {
    return rollno;
  }
  
  
  
  public int getM1()
  {
    return m1;
  }
 
  public int getM2()
  {
    return m2;
  }

  public int getM3()
  {
    return m3;
  }
  

  public double getAvg()
  {
    return (m1+m2+m3)/3.0;
  }

  public void setName(String newName)
  {
    name=newName;
  }

  public void setRollno(int newRollno)
  {
    rollno=newRollno;
  }
  
 
  
  public void setM1(int newM1)
  {
     m1= newM1;
  }

  public void setM2(int newM2)
  {
    m2=newM2;
  }
  
  public void setM3(int newM3)
  {
    m3=newM3;
  }
 
//----------------------------------------------------------------------------------------------------------------------------------------------------
//setters and getters for student 2

  public String getName1()
  {
    return name1;

  }

  public int getRollno1()
  {
    return rollno1;
  }
  
  
  
  public int getM11()
  {
    return m11;
  }
 
  public int getM22()
  {
    return m22;
  }

  public int getM33()
  {
    return m33;
  }
  

  public double getAvg1()
  {
    return (m11+m22+m33)/3.0;
  }

  public void setName1(String newName1)
  {
    name1=newName1;
  }

  public void setRollno1(int newRollno1)
  {
    rollno1=newRollno1;
  }
  
 
  
  public void setM11(int newM11)
  {
     m11= newM11;
  }

  public void setM22(int newM22)
  {
    m22=newM22;
  }
  
  public void setM33(int newM33)
  {
    m33=newM33;
  }
 
//---------------------------------------------------------------------------------------------------------------------------------
//setters and getters for student 3
  public String getName2()
  {
    return name2;

  }

  public int getRollno2()
  {
    return rollno2;
  }
  
  
  
  public int getM111()
  {
    return m111;
  }
 
  public int getM222()
  {
    return m222;
  }

  public int getM333()
  {
    return m333;
  }
  

  public double getAvg2()
  {
    return (m111+m222+m333)/3.0;
  }

  public void setName2(String newName2)
  {
    name2=newName2;
  }

  public void setRollno2(int newRollno2)
  {
    rollno2=newRollno2;
  }
  
 
  
  public void setM111(int newM111)
  {
     m111= newM111;
  }

  public void setM222(int newM222)
  {
    m222=newM222;
  }
  
  public void setM333(int newM333)
  {
    m333=newM333;
  }
 


}




public class StudRes
{
  public static void main(String args[])
  {
    //Details of student 1
    Student S1=new Student();
    
    System.out.print("Enter name:");
    String name=System.console().readLine();
    S1.setName(name);
    
   
    
    System.out.print("Enter roll number:");
    int rollno=Integer.parseInt(System.console().readLine());
    S1.setRollno(rollno);
   
    
    System.out.print("Enter marks1:");
    int m1=Integer.parseInt(System.console().readLine());
    S1.setM1(m1);
    
    
    System.out.print("Enter marks2:");
    int m2=Integer.parseInt(System.console().readLine());
    S1.setM2(m2);
    
    
    
    System.out.print("Enter marks3:");
    int m3=Integer.parseInt(System.console().readLine());
    S1.setM3(m3);
   
   
    
    System.out.println("Name:" +S1.getName());
    System.out.println("Roll Number :" +S1.getRollno());
    System.out.println("Marks1:" +S1.getM1());
    System.out.println("Marks2:" +S1.getM2());
    System.out.println("Marks3:" +S1.getM3());
    System.out.println("Average:" +S1.getAvg());
 
   //Details of student 2
   Student S2=new Student();
   
   System.out.print("Enter name:");
   String name1=System.console().readLine();
   S2.setName1(name1);

   System.out.print("Enter roll number:");
   int rollno1=Integer.parseInt(System.console().readLine());
   S2.setRollno1(rollno1);

   System.out.print("Enter marks1:");
   int m11=Integer.parseInt(System.console().readLine());
   S2.setM11(m11);
   
   System.out.print("Enter marks2:");
   int m22=Integer.parseInt(System.console().readLine());
   S2.setM22(m22);

   System.out.print("Enter marks3:");
   int m33=Integer.parseInt(System.console().readLine());
   S2.setM33(m33);


   
    System.out.println("Name:" +S2.getName1());
    System.out.println("Roll Number :" +S2.getRollno1());
    System.out.println("Marks1:" +S2.getM11());
    System.out.println("Marks2:" +S2.getM22());
    System.out.println("Marks3:" +S2.getM33());
    System.out.println("Average:" +S2.getAvg1());


//Details of student 3

  Student S3=new Student();
  
  System.out.print("Enter name:");
  String name2=System.console().readLine();
  S3.setName2(name2);
  
  System.out.print("Enter roll number:");
  int rollno2=Integer.parseInt(System.console().readLine());
  S3.setRollno2(rollno2);

  System.out.print("Enter marks1:");
  int m111=Integer.parseInt(System.console().readLine());
  S3.setM111(m111);

  System.out.print("Enter marks2:");
  int m222=Integer.parseInt(System.console().readLine());
  S3.setM222(m222);

  System.out.print("Enter marks3:");
  int m333=Integer.parseInt(System.console().readLine());
  S3.setM333(m333);



  
   System.out.println("Name:" +S3.getName2());
   System.out.println("Roll Number :" +S3.getRollno2());
   System.out.println("Marks1:" +S3.getM111());
   System.out.println("Marks2:" +S3.getM222());
   System.out.println("Marks3:" +S3.getM333());
   System.out.println("Average:" +S3.getAvg2());




  }

}