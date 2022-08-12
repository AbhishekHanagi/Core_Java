class StringCreate
{
	public static void main(String[] args)
	{
		String st=new String();
		System.out.println(st);
		
		String st1=new String("bat");
		System.out.println(st1);
		
		StringBuffer buffer=new StringBuffer("BAN");
		String st2=new String(buffer);
		System.out.println(st2);
		
		char[] value={'M','N','O','P'};
		String st3=new String(value);
		System.out.println(st3);
		
		byte[] bytes={67,65,84};
		String str4=new String(bytes);
		System.out.println(str4);
		
		int[] codePoints={8,10,7,2,6};
		String str5=new String(codePoints,0,5);
		System.out.println(str5);
		
	    String str6=new String(bytes,0,3);
		System.out.println(str6);
		
		StringBuilder builder=new StringBuilder("New");
		String str7=new String(builder);
		System.out.println(str7);
		
		char[] val={'A','B','H','I'};
		String str8=new String(val,0,4);
		System.out.println(str8);
	}
}