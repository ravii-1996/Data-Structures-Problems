#include<iostream>
using namespace std;
int main()
{
    int x,i;
    string num;
    cin>>x;
    int arr[x];
    for(i=0;i<x;i++)
    {
        cin>>num;
        int count=0;
        for(int j=0;j<num.length();j++)
        {
            if('4'==num.at(j))
            {
                count++;
            }
        }
        arr[i]=count;
    }
    for(i=0;i<x;i++)
        cout<<arr[i]<<endl;
}

