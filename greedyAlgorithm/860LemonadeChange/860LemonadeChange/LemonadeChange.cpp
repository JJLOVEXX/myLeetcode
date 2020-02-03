#include<iostream>
#include<vector>

using namespace std;

bool lemonadeChange(vector<int>&);
int main() {
	vector<int>bills = { 5,5,10 };
	cout << lemonadeChange(bills);
	system("pause");
}

bool lemonadeChange(vector<int>& bills)
{
	int change[3] = { 0 };
	for (int i = 0; i < bills.size(); i++)
	{
		if (bills[i]==5)
		{
			change[0]++;
		}
		else if (bills[i]==10)
		{
			change[0]--;
			change[1]++;
			if (change[0]<0)
			{
				return false;
			}
			else
			{
				continue;
			}
		}
		else if (bills[i]==20)
		{
			if (change[1]>0)
			{
				change[1]--;
				change[0]--;
				if (change[0]<0)
				{
					return false;
				}
				else
				{
					continue;
				}
			}
			else
			{
				change[0] -= 3;
				if (change[0]<0)
				{
					return false;
				}
				else
				{
					continue;
				}
			}
		}
	}
	return true;
}
