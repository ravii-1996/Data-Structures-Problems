#include <iostream>
using namespace std;
int gcd(int a,int b)
{
	int gcd;
	for(int i=1;i<=a && i<=b;++i)
    {
        if(a%i==0 && b%i==0)
            gcd=i;
    }
	return gcd;
}
int main()
{
	int a,b,n;
	cin>>a>>b>>n;
	int temp=1;
	while(n>0)
	{
		if(temp%2==0)
			n=n-gcd(b,n);
		else
			n=n-gcd(a,n);
		temp++;
	}
	if(temp%2==0)
		cout<<"0";
	else
		cout<<"1";
    return 0;
}
