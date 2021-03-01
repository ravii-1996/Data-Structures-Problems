#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int arr[n+1][n+1];
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1||j==1)
				arr[i][j]=1;
			else
			{
				arr[i][j]=arr[i-1][j]+arr[i][j-1];
			}
		}
	}
	cout<<arr[n][n];
	return 0;
}
