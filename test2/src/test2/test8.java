package test2;
class iccard{
	long id;
	int money;
}
public class test8 {
public static void main(String[] argv){
	iccard mycard=new iccard();
	
	mycard.id=0x876544fd;
	mycard.money=2345;
	
	
	System.out.println(mycard.id+" "+mycard.money);
}
}
