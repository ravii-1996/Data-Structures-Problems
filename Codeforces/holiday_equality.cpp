#include<iostream>
using namespace std;
int main()
{
	int n,max=0,temp=0;
	cin>>n;
	int x[n];
	for(int i=0;i<n;i++)
	{
		cin>>x[i];
		if(x[i]>max)
			max=x[i];
	}
	for(int i=0;i<n;i++)
	{
		temp=temp+max-x[i];
	}
	cout<<temp;
	return 0;
}
