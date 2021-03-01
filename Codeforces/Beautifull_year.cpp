#include<iostream>
using namespace std;
int main()
{
	int a,b,c,d,n;
	cin>>n;
	do
	{
		n++;
		a=n/1000;
		d=n%10;
		c=(n%100)/10;
		b=(n/100)%10;
	
	}
	while(a==b||a==c||a==d||b==d||b==c||c==d);
	cout<<n;
	return 0;
}
