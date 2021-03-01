#include<iostream>
using namespace std;
int main()
{
	int n,s,x,y,flag;
	cin>>s>>n;
	for(int i=0;i<n;i++)
	{
		cin>>x>>y;
		if(s>=x)
		{
			s=s+y;
		}
		else
			flag=1;
		
	}
	if(flag==1)
		cout<<"NO";
	else
		cout<<"YES";
	return 0;
}
