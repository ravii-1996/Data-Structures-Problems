#include<iostream>
using namespace std;
int main()
{
	int n,temp,temp2,min=100,max=0;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
		if(arr[i]>max)
			max=arr[i];
		if(arr[i]<min)
			min=arr[i];
	}
	for(int i=0;i<n;i++)
	{
		if(max==arr[i])
		{
			temp=i;
			break;
		}
	}
	for(int i=0;i<n;i++)
	{
		if(min==arr[i])
		{
			temp2=n-i-1;
		}
	}
	if(temp+temp2>=n)
		cout<<temp+temp2-1;
	else
		cout<<temp+temp2;
	return 0;
}
