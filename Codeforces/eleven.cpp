#include<iostream>
using namespace std;
int fib(int p,int n)
{
	int arr[n];
	arr[0]=1;
	arr[1]=1;
	for(int i=0;i<=n;i++)
	{
		arr[i+2]=arr[i+1]+arr[i];
	}
	for(int i=0;i<=n;i++)
	{
		if(arr[i]==p)
			return 1;
	}
	return 0;
}
int main()
{
	int n;
	cin>>n;
	//n=fib(n);
	for(int i=1;i<=n;i++)
	{
		if(fib(i,n))
			cout<<"O";
		else
			cout<<"o";
	}
	
	return 0;
	
}
