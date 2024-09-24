public class UnaryOperators
{
  public static void main(String[] args)
  {
    int a=5;
    int b=4;
    int c=6;
    int d=23;
    System.out.print("\n");//jumping towards next line
    System.out.println(++a);//6 will be output
    System.out.print(b++);//4 will be output
    System.out.println("\n"+ ++b);//one line skipped and then 6 to be output
    c +=++a+4;System.out.println(c);//17 will be output
    d %=5;//3 will be output
    System.out.println(d+"...."+ --d);//3....2 will be output
  }
}
/*With \n line is being jumped. With ++a first number is being incremented and then
 being printed. With b++ first number is being printed then incremented. With --d
 number is being decremented.*/