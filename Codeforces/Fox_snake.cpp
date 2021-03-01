#include<iostream>
using namespace std;
int main()
{
	int n,m,k=1;
	cin>>n>>m;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			if(i%2!=0 && k%2!=0)
			{
				if(j==m-1)
					cout<<"#";
				else
					cout<<".";
				k++;
			}
			else if(i%2!=0 && k%2==0)
			{
				if(j>0)
					cout<<".";
				else
					cout<<"#";
				k++;
			}
			else
				cout<<"#";
		}
		cout<<"\n";
	}
	return 0;
}
