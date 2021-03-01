#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n],first,second;
    string str;
    for(int i=0;i<n;i++)
    {
        cin>>str;
        first=(int)str.at(0)-48;
        second=(int)str.at(str.length()-1)-48;
        arr[i]=first+second;
    }
    for(int i=0;i<n;i++)
        cout<<arr[i]<<endl;
}
