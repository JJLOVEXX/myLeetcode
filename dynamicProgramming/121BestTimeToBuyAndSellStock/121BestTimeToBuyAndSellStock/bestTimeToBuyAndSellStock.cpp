#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int maxProfit(vector<int>& prices);

int main() {
	vector<int>prices = { 7,1,5,3,6,4 };
	cout << maxProfit(prices);
	system("pause");
}

int maxProfit(vector<int>& prices)
{
	int max = 0;
	for (int j = 0; j < prices.size(); j++)
	{
		for (int i = j; i < prices.size(); i++)
		{
			if (prices[i]>prices[j])
			{
				int profit = prices[i] - prices[j];
				if (profit>max)
				{
					max = profit;
				}
			}
		}
	}
	return max;
}
