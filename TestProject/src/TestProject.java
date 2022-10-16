
public class TestProject {

	public class First {
		static int a=100;
		static int b=200;
		static int c;
		static void add()
		{
			c=a+b;
			System.out.println("The sum is:"+c );
		}
		static void sub()
		{
			c=a-b;
			System.out.println("The difference is:"+c);
		}
		public static void main(String[] args) {
			
			First obj=new First();
			First.add();
			First.sub();
		}

	}
}
