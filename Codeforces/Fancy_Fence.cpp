#include<iostream>
using namespace std;
int main()
{
	int n,x;
	 cin>>n;
	for(int i=0;i<n;i++)
	{
		cin>>x;
		if(360%(180-x)==0)
			cout<<"YES\n";
		else
			cout<<"NO\n";
	}
	return 0;
}
