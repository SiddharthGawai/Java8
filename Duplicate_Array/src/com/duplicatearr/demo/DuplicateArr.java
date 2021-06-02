package com.duplicatearr.demo;

public class DuplicateArr {

	public static void main(String[] args) {
		String arr[] = {"AAA","BBB","CCC","DDD","AAA","BBB"};
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate array is:"+arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		}
				
				

	}

}
