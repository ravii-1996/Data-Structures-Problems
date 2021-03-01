#include<iostream>
using namespace std;
int main()
{
	int n,k,count=1,i=1;
	cin>>n>>k;
	while(1)
	{
		if(n*i%10==k || n*i%10==0)
			break;
		else
			count++;
		i++;
	}
	cout<<count;
	
	return 0;
}
