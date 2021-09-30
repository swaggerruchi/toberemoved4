import java.util.Scanner;

class rev_str{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter string\n");
String s;
String rev = "";
s = sc.nextLine();

for(int i = s.length()-1; i>=0; i--){

rev = rev + s.charAt(i);

}

System.out.println("reverse string is : " + rev);

if(s.equals(rev)){

System.out.println("Strings are palindrome\n");

}
else{

System.out.println("Strings are not palindrome\n");

}

String f = "";
String [] split = s.split(" "); 

for(int i = split.length-1; i>=0; i--){

f = f + split[i] + " ";

}

System.out.println("reverse string is : " + f);

int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=a+b;

System.out.println(c);


}

}
