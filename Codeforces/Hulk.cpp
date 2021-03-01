#include<iostream>
using namespace std;
int main()
{
	string str1="I hate ",str2="I love ",str;
	int n;
	cin>>n;
	str="I hate ";
	for(int i=2;i<=n;i++)
	{	
		str=str + "that ";
		if(i%2==0)
			str=str+str2;
		else
			str=str+str1;
	}
	str=str+"it";
	cout<<str;
	return 0;
}
