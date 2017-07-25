package test2;
import java.util.*;
public class test1 {
public static void main(String[] argv){
int i=0, j, k;
Scanner sc =new Scanner(System.in);
j= sc.nextInt();
for(k=1;k<=j;k+=2){
	i += k;
}
System.out.println("1到"+j+"所以基數和"+i);
}

}
