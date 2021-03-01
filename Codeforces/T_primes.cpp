#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	long long int n,x,i,j,temp,num;
	cin>>n;
	for(i=0;i<n;i++)
	{
		temp=0;
		cin>>x;
		for(j=2;j<=x/2;j++)
		{
			if(x%j==0)
				temp++;
		}
		if(temp==1)
			cout<<"YES\n";
		else
			cout<<"NO\n";
	}
	return 0;
}
