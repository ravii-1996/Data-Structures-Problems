#include <iostream>
 using namespace std;
 int main()
 {
int n,x,t=0;
 	cin>>n>>x;
  char a[n*x];
  for(int i=0;i<(n*x);i++)
    {
  	cin>>a[i];
  if(a[i]=='W'||a[i]=='B'||a[i]=='G')
  t++;
  }
if(t==n*x)
    {
cout<<"#Black&White";
}
else
{
cout<<"#Color";
}

 }
