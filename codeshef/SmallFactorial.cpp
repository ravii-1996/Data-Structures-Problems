#include<iostream>
using  namespace std;
int fact (int);
int main()
{
int t;
cin>>t;
int a[t-1];
for(int i=0;i<t;i++)
{
	int input;
	cin>>input;
	a[i]=fact(input);
}
for(int i=0;i<t;i++)
{
	cout<<a[i]<<"\n";
}
return 0;
}

int fact(int x)
{
	int temp=1;
	if(x!=0)
	{
		while(x>0)
		{
			temp=temp*x;
			x--;
		}
		return temp;
	}
	else
	{
		return 1;
	}

}
