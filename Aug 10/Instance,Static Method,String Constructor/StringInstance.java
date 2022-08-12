class StringInstance
{
	public static void main(String[] args)
	{
		String name="Abstract";
		String p=name.toUpperCase();
		System.out.println(p);
		
		String q=name.trim();
		System.out.println(q);
		
		boolean r=name.contains("A");
		System.out.println(r);
		
		String t="access";
		int y=name.compareTo(t);
		System.out.println(y);
		
		char g=name.charAt(1);
		System.out.println(g);
		
		int k=name.codePointAt(1);
		System.out.println(k);
		
		int e=name.codePointCount(0,7);
		System.out.println(e);
		
		String str="ed";
		String l=name.concat(str);
		System.out.println(l);
		
		boolean o=name.endsWith("t");
		System.out.println(o);
		
		String j=name.replace('A','N');
		System.out.println(j);
		
		int w=name.length();
		System.out.println(w);
		
		boolean x=name.matches("Acb");
		System.out.println(x);
		
		String d=name.intern();
		System.out.println(d);
		
		boolean m=name.isEmpty();
		System.out.println(m);
		
		String v=name.substring(0,4);
		System.out.println(v);
	}
}