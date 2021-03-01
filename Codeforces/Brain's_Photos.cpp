#include<iostream>
using namespace std;
int main()
{
    int n,m,flag=0;
    cin>>n>>m;
   char ch[n*m];
    for(int i=0;i<=(n*m)-1;i++)
    {
            cin>>ch[i];
            if(ch[i]=='C'||ch[i]=='M'||ch[i]=='Y')
                flag++;
        }
    if(flag>0)
    {
        cout<<"#Color\n";
    }
    else
        cout<<"#Black&White\n";
    return 0;
}
