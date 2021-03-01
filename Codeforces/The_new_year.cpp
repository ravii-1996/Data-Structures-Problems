#include<iostream>
#include<algorithm>
using namespace std; 
int main()
{
	int arr[3];
	int sum =0;
	for(int i=0;i<3;i++)
		cin>>arr[i];
	sort(arr,arr+3);
	for(int i=1;i<3;i++)
		sum=sum+arr[i]-arr[i-1];
	cout<<sum;
	return 0;
}
