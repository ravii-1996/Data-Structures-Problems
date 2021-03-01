#include<bits/stdc++.h>
using namespace std;
int a[13];
int main(){
	int k;
	cin>>k;
	for(int i=1;i<=12;i++)
		cin>>a[i];
	sort(a,a+13);
	int ans=0;
	for(int i=12;i>=0;i--){
		if(ans>=k){
			cout<<12-i;
			return 0;
		}
		ans+=a[i];
	}
	cout<<-1;
}
