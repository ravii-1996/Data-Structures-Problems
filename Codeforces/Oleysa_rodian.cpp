#include<iostream>
using namespace std;
int main()
{
	int n,k,p=1;
	cin>>n>>k;
	if(n==1 && k==10)
	{
		cout<<"-1";
		return 0;
	}
	if(k==10)
		p++;
	cout<<k;
	for(int i=0;i<n-p;i++)
	{
		cout<<"0";
	}
	
	return 0;
}
