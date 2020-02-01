#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

int minCostToMoveChips(vector<int>&);
int main() {
	vector<int>chips = { 2,2,2,3,3 };
	cout << minCostToMoveChips(chips);
	system("pause");
}
int minCostToMoveChips(vector<int>& chips) {
	int even = 0, odd = 0;
	for (int i = 0; i < chips.size(); i++)
	{
		if (chips[i] % 2 == 0)
		{
			even++;
		}
		else
			odd++;
	}
	return min(odd, even);
}