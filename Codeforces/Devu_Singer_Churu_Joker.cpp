#include<iostream>
using namespace std;
int main()
{
	int n,d,t,total=0;
	cin>>n>>d;
	for(int i=0;i<n;i++)
	{
		cin>>t;
		total=total+t;
	}
	if(d<(10*(n-1)+total))
		cout<<"-1";
	else
	{
		cout<<(d-total)/5;
	}
	return 0;
}
