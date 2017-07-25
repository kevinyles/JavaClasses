package test2;

public class test7 {
public static void main(String [] argv){
	double [] stu;
	stu=new double[5];
	
	stu[0]=80;
	stu[1]=70;
	stu[2]=40;
	stu[3]=30;
	stu[4]=20;

	double sun= 0;
		
			for(int i =0;i<stu.length;i++){
				sun += stu[i];
			}
			double average = sun / stu.length;
			System.out.println(average);
}
}
