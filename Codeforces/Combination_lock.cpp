#include<iostream>
#include<string.h>
#include<math.h>
using namespace std;
int main()
{
    int n,a,b,c,temp=0;
    cin>>n;
    string s1,s2;
    cin>>s1>>s2;
    for(int i=0;i<n;i++)
        {
            a=(int)s1.at(i);
            b=(int)s2.at(i);
           c= fabs(a-b);
           if(c<5)
           {
               temp=temp+c;
           }
           else
                temp=temp+10-c;
        }
        cout<<temp;
        return 0;

}
