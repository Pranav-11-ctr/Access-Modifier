
public class AccesSpecifier1 {

	
		// TODO Auto-generated method stub
		private int pri_n;
		public void setA(int num)
		{
			pri_n=num;
		}
		public int getA()
		{
			return pri_n;
		}
		
		int n;
		protected int pro_n;
		public int pub_n;
		
		public static void main(String[] args)
		{
			AccesSpecifier1 as=new AccesSpecifier1();
			as.pri_n=1;
			as.n=2;
			as.pro_n=3;
			as.pub_n=4;
			System.out.println("private = "+as.pri_n);
			System.out.println("default = "+as.n);
			System.out.println("protected = "+as.pro_n);
			System.out.println("public = "+as.pub_n);
			
		}
		
		

	}

