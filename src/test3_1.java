
public class test3_1 {

	public static void main(String[] args) {
		Car3_1 car1;
		car1 = new Car3_1();

		car1.num = 1234;
		car1.gas = 20.5;
		
		Car3_1 car2;
		car2 = new Car3_1();
		
		car2.num = 2345;
		car2.gas = 30.5;

		System.out.println("car1車號是"+car1.num);
		System.out.println("car1汽油量是"+car1.gas);

		System.out.println("car2車號是"+car2.num);
		System.out.println("car2汽油量是"+car2.gas);
		
		car1.show();
		
		car1.showCar();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}

}

class Car3_1
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("將車號設為"+num);
	}
	
	void setGas(double g)
	{
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
	
	void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
	void showCar()
	{
		System.out.println("開始顯示車子資料");
		this.show();
	}
}
