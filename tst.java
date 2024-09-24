import java.util.Scanner;
public class tst{
public static void main(String[] args){
String s="Abcdef";
String tmp="";
int r1=(int)(1+Math.random()*5);
if(r1==1)
tmp=""+s.charAt(r1)+s.charAt(0)+s.substring(2);
else if(r1==5)
tmp=""+s.charAt(r1)+s.substring(1,r1)+s.charAt(0);
else
tmp=""+s.charAt(r1)+s.substring(1,r1)+s.charAt(0)+s.substring(r1+1);
System.out.println(tmp);

r1=(int)(2+Math.random()*3);
if(r1==2)
s=""+tmp.charAt(0)+tmp.charAt(r1)+tmp.charAt(1)+tmp.substring(3);
else if(r1==5)
s=""+tmp.charAt(0)+tmp.charAt(r1)+tmp.substring(2,r1)+tmp.charAt(1);
else 
s=""+tmp.charAt(0)+tmp.charAt(r1)+tmp.substring(2,r1)+tmp.charAt(1)+tmp.substring(r1+1);
System.out.println(s);

r1=(int)(3+Math.random()*2);
if(r1==3)
tmp=""+s.charAt(0)+s.charAt(1)+s.charAt(r1)+s.charAt(2)+s.substring(4);
else if(r1==5)
tmp=""+s.charAt(0)+s.charAt(1)+s.charAt(r1)+s.substring(3,r1)+s.charAt(2);
else
tmp=""+s.charAt(0)+s.charAt(1)+s.charAt(r1)+s.substring(3,r1)+s.charAt(2)+s.substring(r1+1);

System.out.println(tmp);

  }
}