#include<iostream>
using namespace std;
int main()
{
	int n,temp=0,x,max=0;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		cin>>x;
		if(max<x && n!=1)
		{
			temp++;
			if(i==0)
				continue;
			max=x;
		}
	}
	cout<<temp;
	return 0;
}
