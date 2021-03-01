#include<iostream>
using namespace std;
int main()
{
	int n,j=0;
	cin>>n;
	int temp,arr[n];	
	for(int i=1;i<10000;i++)
	{
	int sum =0;	
			while(i!= 0)
			{
               int temp = i % 10;
               /*if(temp==0)
               {
               		sum=0;
               		break;
			   }*/
               	sum=sum+i;
               i = i/10;
            }
		if(sum==10)
		{	
			arr[j]=sum;
			if(j==n-1)
			{
				cout<<arr[j];
				break;
			}
			j++;	
		}
	}
	return 0;
}
