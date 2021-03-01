#include<iostream>
using namespace std;
int main()
{
    int n,temp=0;
    long int x;
    cin>>n;
    cin>>x;
    for(int i=1;i<=n;i++)
        {

            if(x%i==0&&x/i<=n)
                temp++;

        }

    cout<<temp;
}
