#include<iostream>
using namespace std;
int main()
{
int a,b,c;
    cin>>a>>b>>c;
    cout<<min(a+b+c,min(2*(a+b),min(2*(a+c),2*(b+c))));
return 0;
}
