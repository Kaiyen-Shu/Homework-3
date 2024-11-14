import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3_3_String 
{

	public static void main(String[] args) throws IOException
	{
		String str = "Hello";
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		int len = str.length();
		System.out.println(str+"的第一個字元是"+ch1);
		System.out.println(str+"的第二個字元是"+ch2);
		System.out.println(str+"的長度"+len+"\n");

		System.out.println("請輸入英文字母");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str1u = str1.toUpperCase();
		String str1l = str1.toLowerCase();
		System.out.println("轉換成大寫時為"+str1u);
		System.out.println("轉換成小寫時為"+str1l+"\n");
		
		System.out.println("請輸入字串");
		String str2 = br.readLine();
		System.out.println("請輸入要檢索的文字");
		String str3 = br.readLine();
		char ch = str3.charAt(0);
		int num =str2.indexOf(ch);
		if(num != -1)
			System.out.println(str2+"的第"+(num+1)+"個字就是「"+ch+"」");
		else
			System.out.println(str2+"中沒有「"+ch+"」這個字\n");
		
		System.out.println("請輸入字串");
		String str4 = br.readLine();
		System.out.println("請輸入要新增的字串");
		String str5 = br.readLine();
		StringBuffer sb = new StringBuffer(str4);
		sb.append(str5);
		System.out.println("在「"+str4+"」後新增「"+str5+"」的話，就會變成「"+sb+"」。");
	}

}
