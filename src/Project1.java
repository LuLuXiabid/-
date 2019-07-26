
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class cat{
	cat()
	{
		
	}
	cat(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("name="+this.name+"age="+this.age);
	}
	String name;
	int age;
	public void Print()
	{
		System.out.println("name="+this.name+"age="+this.age);
	}
}
//class fish{
//	fish()
//	{
//		
//	}
//	fish(String name,int age)
//	{
//		this.sname=name;
//		this.sage=age;
//		System.out.println("sname="+this.sname+"sage="+this.sage);
//	}
//	String sname;
//	int sage;
//	cat c=new cat("xiaohua",100);
//	public void Print()
//	{
//		System.out.println("sname="+c.name+"sage="+c.age);
//	}
//	
//	public void Print1()
//	{
//		System.out.println("sname="+this.sname+"sage="+this.sage);
//	}
//	
//}



public class Project1 {
	public static void chazao(String str1) {
		File myfile=new File(str1);
		if(myfile.exists())
		{
			if(myfile.isDirectory())
			{
				File [] files=myfile.listFiles();
				int length=files.length;
				for(int i=0;i<length;i++)
				{
					if(files[i].isDirectory())
					{
						System.out.println("该目录是文件夹：");
					}
					else
					{
						System.out.println("该目录是文件：");
					}
					System.out.println(files[i].getName());
				}
			}
			else
			{
				System.out.println("路径目录不是一个文件夹！");
			}
		
		}
		else
		{
			System.out.println("路径不存在！");
		}
	}
	public static void creat(String str1) 
	{
		File CreatFile=new File(str1);
		if(CreatFile.exists())
		{
			System.out.println(CreatFile.getName()+"文件已存在！");
		}
		else
		{
			try {
				boolean result=CreatFile.createNewFile();
				if(result)
				{
					System.out.println(CreatFile.getName()+"文件创建成功！");
				}
				else
				{
					System.out.println(CreatFile.getName()+"文件创建失败！");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void delete(String str1) 
	{
		File deleteFile1=new File(str1);
		if(deleteFile1.exists())
		{
			boolean result=deleteFile1.delete();
			if(result)
			{
				System.out.println(deleteFile1.getName()+"文件删除成功！");
			}
			else 
			{
				System.out.println(deleteFile1.getName()+"文件删除失败！");
			}
		}
		else 
		{
			System.out.println(deleteFile1.getName()+"文件不存在！");
		}
	}
	public static void read(String str1)
	{
		File readFile1=new File(str1);
		if (readFile1.isDirectory()) 
		{
			System.out.println("文件夹不能读！");
		
		}
		else {
			if (readFile1.exists()) 
			{
				FileReader fi = null;
				try {
					fi = new FileReader(readFile1);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int len=(int) readFile1.length();
				char [] m=new char[len];
			    try {
					int j=fi.read(m);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < len; i++) 
				{
					System.out.print(m[i]);
				}
				try {
					fi.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else 
			{
				System.out.println("文件地址不存在！");
			}
		}
		System.out.println();
	}
	public static void write(String str1) 
	{
		File writeFile1=new File(str1);
		if (writeFile1.isDirectory()) 
		{
			System.out.println("文件夹不能读！");
		
		}
		else 
		{
			FileWriter fW = null;
			try {
				fW = new FileWriter(writeFile1,true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("请输入要写入的内容：");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			char [] m=str.toCharArray();
			try {
				fW.write(m);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fW.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("写入成功！");
		}
	}
	//C:\\Users\\lixiao\\Desktop\\new\\maven-test\\my-maven-test\\lalala.txt
	//"C:\\Users\\lixiao\\Desktop\\new\\maven-test\\my-maven-test"
	public static void main(String[] args) 
	{ 
		String str1;
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入路径：");
		str1=scan.nextLine();
		read(str1);
		write(str1);
	//	chazao(str1);
		//creat() ;
		//delete();
	}
		// TODO Auto-generated method stub
//		System.out.println("hello wprd");
//		System.out.println(args);
//		for(int i=0;i<10;i++)
//		{
//			System.out.println("shabi ");
//		}
//		cat miao=new cat("miaomiao",25);
//		System.out.println(miao.name+"  "+miao.age);
//		cat miao2=new cat();
//		miao2.name="miao2";
//		miao2.age=55;
//	
//		fish ergou=new fish("ergou",88);
//        ergou.Print1();
//        ergou.Print();
//		for(int i=100;i<1000;i++)
//		{
//			int j=i/10;
//			int c=i%10;
//			int b=j%10;
//			int a=j/10;
//			while(a*a*a+b*b*b+c*c*c==i)
//			{
//			System.out.println(i);
//			break;
//			}f
//		int i=50,j=60;
//		int battle=(i<j?i:j);
//		int num=0;
//		for(int n=1;n<=battle;n++ )
//		{
//			if(i%n==0&&j%n==0)
//			{
//				num=n;
//			}
//		
//		}
//		System.out.println(num);
//		int a=3,b=4;
//		double c=0.5;
//		int sum=100;
//		for(int i=0;i<=33;i++)
//		{
//			for(int j=0;j<=25;j++)
//			{
//				int k=100-(i*a+b*j);
//				if(k>0)
//				{
//					System.out.println("i="+i+"j="+j+"k="+k); 
//				}
//				
//			
//			}
//		}
//		
//		
//			
//	}
}
