#include<bits/stdc++.h>
using namespace std;
int main()
{
int n,current,prev=0,max=0,count=0;
cin>>n;
for(int i=0; i<n; i++)
{
	cin>>current;
	if(current>=prev)
		count++;
	else
		count=1;
	prev=current;
	if(count>max)
		max=count;
}
cout<<max;
}
