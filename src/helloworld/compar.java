
package helloworld;
import java.util.*;  
public class compar   
{  
public static void main(String args[])  
{  

ArrayList<Integer> list = new ArrayList<Integer>();  
list.add(566);  
list.add(230);  
list.add(123);  
list.add(110);  
list.add(689);  
list.add(12);  
list.add(95);  

System.out.println("ArrayList Before Sorting:");  
for(int marks: list)  
{  
System.out.println(marks);  
}   

Collections.sort(list, Collections.reverseOrder());  

System.out.println("ArrayList After Sorting:");  
for(int marks: list)  
{  
System.out.println(marks);  
}  
}  
}  