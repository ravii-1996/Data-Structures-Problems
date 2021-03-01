#include<iostream>
using namespace std;
int main()
{
	int n,temp=0;
	for(int i=0;i<5;i++)
	{
		cin>>n;
		temp=temp+n;
	}
	int p=temp/5;
	if(temp%5==0 && p>0)
		cout<<p;
	else
		cout<<"-1";
	return 0;
}
