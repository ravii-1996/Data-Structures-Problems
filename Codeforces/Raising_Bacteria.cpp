#include<iostream>
using namespace std;
int main()
{
    int x,temp=0;
    cin>>x;
    cout<< __builtin_popcount (x);      //          USE TO FIND THE GCD OF A NUMBER
    /*while(x)
    {
        if(x%2)
            temp++;
           x=x/2;
    }
    cout<<temp;*/
    return 0;

}

