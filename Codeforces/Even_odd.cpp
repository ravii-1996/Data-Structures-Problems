#include<iostream>
using namespace std;
int main(){
	long long int n,k,ans;
	cin>>n>>k;
	if(k>n/2+n%2)
		ans=(k-n/2-n%2)*2;
	else
		ans=k*2-1;
	cout<<ans;
}
