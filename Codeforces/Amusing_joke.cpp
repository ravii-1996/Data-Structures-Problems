#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	string st1,st2,st3,str;
	cin>>st1>>st2>>st3;
	str=st1+st2;
	sort(str.begin(), str.end());
	sort(st3.begin(), st3.end());
	if(str.compare(st3)==0)
		cout<<"YES";
	else
		cout<<"NO";
	
	
	
	return 0;
}
