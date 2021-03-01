#include<bits/stdc++.h>
using namespace std;
int main()
{
int n,m,a[100],f=1000;
cin>>n>>m;
for(int i=0; i<m; i++)
cin>>a[i];
sort(a,a+m);
for(int i=0; i+n-1<m; i++)
f=min(f,a[i+n-1]-a[i]);
cout<<f;

}
