
public class test3_2 {

	public static void main(String[] args) {
		
		Car3_2.showSum();
		
		Car3_2 car1;
		car1 = new Car3_2();
		car1.show();
		
		Car3_2.showSum();
		
		Car3_2 car2;
		car2 = new Car3_2(1234,25.0);
		car2.show();
		
		
		car1.setNumGas(1234, 20.5);
		car1.show();
		
		System.out.println("指定不正確的汽油量{-10.0}看看");
		
		car1.setNumGas(1234,-10.0);
		car1.show();
		
		car1.setCar(1234, 20.5);
		car1.show();
		
		System.out.println("只變更車號");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("只變更汽油量");
		car1.setCar(30.5);
		car1.show();
	}

}

class Car3_2
{
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car3_2()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}
	
	public Car3_2(int n,double g)
	{
		this();
		num = n;
		gas = g;
		sum++;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void setCar(int n)
	{
		num = n;
		System.out.println("將車號設為"+num);
	}
	
	public void setCar(double g)
	{
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
	
	public void setCar(int n ,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	
	public void setNumGas(int n,double g)
	{
		if(g>0&&g<100)
		{
			num = n;
			gas = g;
			System.out.println("將車號設為"+num+"，汽油量設為"+gas);
		}
		else
		{
			System.out.println(g+"不是正確的汽油量");
			System.out.println("無法變更汽油量");
		}
	}
	
	public static void showSum()
	{
		System.out.println("車子總共有"+sum+"台");
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}