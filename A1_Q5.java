
public class A1_Q5 {

	public static void main(String[] args) {
		double sal =25000;double tax=0.0;
		if(sal>0 && sal<14999);{
		System.out.println("Base Tax = 0");
				tax=0.0+(sal*0.15);
				System.out.println("Tax is : " + tax);

	}
if(sal>15000 && sal< 29999);{
	System.out.println("Base Tax =2500");
	tax = 2500+(sal*0.18);
	System.out.println("Tax is : " +tax);
	
}
if(sal>30000 && sal<49999);{
	System.out.println("Base Tax = 5400");
	tax=5400+(sal*0.22);
	System.out.println("Tax is:" +tax);
}
if(sal>50000 && sal< 79999);{
	System.out.println("Base Tax =11000");
	tax =11000+(sal*0.27);
	System.out.println("Tax is:"+tax);
}
if ( sal>80000 && sal<150000);{
	System.out.println("Base Tax =21600");
	tax = 21600+(sal*0.33);
	System.out.println("Tax is :" +tax);
	
}
if (sal>15000);{
System.out.println("-1");
	}

}
}
