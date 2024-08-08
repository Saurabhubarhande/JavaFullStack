class StringTest1{
public static void main(String args[]){

String s1="hello";//




String s2="hello";

System.out.println(s1);
System.out.println(s2);

System.out.println("s1.hashCode()"+s1.hashCode());
System.out.println("s2.hashCode()"+s2.hashCode());





s1=s1+"hai";
s2=s2+"hi";


System.out.println(s1);
System.out.println(s2);

System.out.println(s1.hashCode());
System.out.println(s2.hashCode());



}
}