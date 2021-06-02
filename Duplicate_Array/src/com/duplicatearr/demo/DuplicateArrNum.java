package com.duplicatearr.demo;

public class DuplicateArrNum {

	public static void main(String[] args) 
	{
		int[] arr = {2,3,4,2,4,5,7,8,3,7};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
