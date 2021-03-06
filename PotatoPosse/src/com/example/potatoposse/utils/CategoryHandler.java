package com.example.potatoposse.utils;

import com.example.potatoposse.R;

public class CategoryHandler 
{
	public static int getIcon(int index)
	{
		switch(index)
		{
			case 0:	return R.string.ic_leaf;
			case 1: return R.string.ic_pest;
			case 2: return R.string.ic_tuber;
		}
		
		return -1;
	}
	
	public static int getIcon(String name)
	{
		if (name.equals("LEAF")) return R.string.ic_leaf;
		else if (name.equals("PEST")) return R.string.ic_pest;
		else if (name.equals("TUBER")) return R.string.ic_tuber;

		return -1;
	}
	
	public static String[] getCategories()
	{
		return new String[]{"LEAF", "PEST", "TUBER"};
	}
	
	public static int getIndex(String field)
	{
		if (field.equals("DESCRIPTION")) return 0;
		else if (field.equals("TEST_1")) return 1;
		else if (field.equals("TEST_2")) return 2;
		else if (field.equals("CONTROL")) return 3;
		
		return -1;
	}
}