#include<iostream>
#include<vector>

using namespace std;

int maxProfit(vector<int>&);
int main() {
	vector<int>p = { 7,1,5,3,6,4 };
	cout << maxProfit(p);
	system("pause");
}

int maxProfit(vector<int>& prices)
{
	int maxProfit = 0;
	for (int i = 1; i < prices.size(); i++)
	{
		if (prices[i]>prices[i-1])
		{
			maxProfit += prices[i] - prices[i - 1];
		}
	}
	return maxProfit;
}
