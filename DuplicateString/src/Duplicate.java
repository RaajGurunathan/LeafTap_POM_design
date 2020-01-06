
public class Duplicate {
	public  void StringDuplicate()
	{
       String str="paypal India";
      char a[]=str.toCharArray();
      char b[]=str.toCharArray();
      for(int i=0;i<str.length();i++)
      {
       for(int j=0;j<str.length();j++)
       {
    	   if(a[i]==b[j])
    	   {
    		   a[i]=' ';
    	   }
       }
       System.out.println(a[i]);
      }
	}
   public static void main(String[] args) {
	 Duplicate d=new Duplicate();
	 d.StringDuplicate();

	}

}
