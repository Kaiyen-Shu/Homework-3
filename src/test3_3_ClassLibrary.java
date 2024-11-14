import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3_3_ClassLibrary {

	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入一個整數");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tr = br.readLine();
		
		int num = Integer.parseInt(tr);
		
		System.out.println("您輸入的數字是"+num);
	}

}
