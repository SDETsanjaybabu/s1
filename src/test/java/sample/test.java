package sample;

import java.util.LinkedHashSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] s= {"a","ab","abc","vscdvs","hi","b"};
	String maxlength=s[0];
	//System.out.println(maxlength.length());
	for(int i=1;i<s.length;i++)
	{
		//System.out.println(s[i].length());
		if(maxlength.length()>s[i].length())
		{
			maxlength=s[i];
		}
	}
	for(int i=0;i<s.length;i++)
	{
		//System.out.println(s[i].length());
		if(maxlength.length()==s[i].length())
		{
			System.out.println(s[i]);
		}
	}
	}

}
