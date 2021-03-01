#include<iostream>
using namespace std;
int main()
{
	long int n,m,count=0,temp=0,x;
	cin>>n>>m;
	for(long int i=0;i<m;i++)
	{
		cin>>x;
		if(temp>x)
			count=count+n;
		temp=x;
	}
	count=count+temp-1;
	cout<<count;
	
	
	return 0;
}
