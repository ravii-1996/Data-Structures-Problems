#include<iostream>
using namespace std;
int main()
{
	int n,k,i=2,temp=5,count=0;
	cin>>n>>k;
	k=240-k;
	while(temp<=k && count<n)
	{
		temp=temp+5*i;
		i++;
		count++;
	}
	cout<<count;
	return 0;
}
