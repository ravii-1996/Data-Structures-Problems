#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int prime(int n)
{
	for(int i=2;i<=(int)sqrt(n);i++)
	{
		if(n%i==0)
		{
			return 1;
			
		}
	}
	return 0;
}
int main()
{
	int n,k=0;
	cin>>n;
	int arr[n];
	for(int i=4;i<n;i++)
	{
		if(prime(i))
		{
			arr[k]=i;
			k++;
		}
	}
	for(int i=0;i<k;i++)
	{
		for(int j=0;j<k;j++)
		{
			if(arr[i]+arr[j]==n)
			{
				cout<<arr[i]<<" "<<arr[j]<<"\n";
				exit(1);
			}
		}
		
	}
	
	return 0;
}
