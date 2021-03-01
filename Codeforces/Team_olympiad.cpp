#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int a[n];
	int one=0,two=0,three=0;
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
		if(a[i]==1)
			one++;
		else if(a[i]==2)
			two++;
		else
			three++;
	}
	int q=min(one,(min(two,three)));
	cout<<q<<endl;
	int i=0;
	for(int m=0;m<q;m++)
	{
		for(int k=1;k<=3;k++)
		{
			while(i<n)
			{
				if(a[i]==k)
				{
					cout<<i+1<<"\t";
					a[i]=0;
					i=0;
					break;
				}
				i++;
				
			}
		}
		cout<<"\n";	
	}	
	return 0;
}
