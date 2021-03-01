#include<iostream>
using namespace std;
int main()
{
	int a,b,count=1;
	cin>>a>>b;
	for(;;)
	{
		a=3*a;
		b=2*b;
		if(a>b)
		{
			cout<<count;
			break;
		}
		count++;	
	}
	
	
	
	return 0;
}
