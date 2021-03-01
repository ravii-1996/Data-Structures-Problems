#include<iostream>
using namespace std;
int main()
{
	int n,p,q,count=0;
	cin>>n>>p;
	int arr[2*n];
	for(int i=0;i<p;i++)
	{
		cin>>arr[i];
	}
	cin>>q;
	for(int i=p;i<p+q;i++)
		cin>>arr[i];
	for(int i=1;i<=n;i++)
	{
		for(int j=0;j<p+q;j++)
		{
			if(i==arr[j])
			{
				count++;
				break;
			}
		}
	}
	if(count==n)
		cout<<"I become the guy.";
	else
		cout<<"Oh, my keyboard!";
	
	return 0;
}
