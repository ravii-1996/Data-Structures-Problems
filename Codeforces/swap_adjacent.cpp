#include<iostream>
#include<algorithm>
#include<string.h>
using namespace std;
int main()
{
	int long n,flag=0;
	string str;
	cin>>n;
	int long arr[n],a[n];
	for(int long i=0;i<n;i++)
	{
		cin>>arr[i];
		a[i]=arr[i];
	}
	cin>>str;
	sort(arr,arr+n);
	for(int long i=0;i<n-1;i++)
	{
		if(str[i]=='0')
		{	
			if(arr[i]!=a[i])
				flag=1;
		}		
	}
	if(flag==1)
		cout<<"NO";
	else
		cout<<"YES";

	
	return 0;
}
