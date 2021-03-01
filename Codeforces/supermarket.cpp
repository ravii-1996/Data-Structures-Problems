#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int n,m;
	cin>>n>>m;
	double x,y;
	float arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>x>>y;
		arr[i]=x/y;
	}
	sort(arr,arr+n);
	cout<<arr[0]*m;
	return 0;
}
