#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

int lastStoneWeight(vector<int>&);
bool Comp(const int &, const int &);

int main() {
	vector<int>s = { 2,2 };
	cout << lastStoneWeight(s);
	system("pause");
}

bool Comp(const int &a, const int &b)
{
	return a > b;
}

int lastStoneWeight(vector<int>& stones)
{
	int x = 0, y = 0;
	int count = stones.size();
	for (int i = 0; i < count-1; i++)
	{
		sort(stones.begin(), stones.end(),Comp);//降序排列
		y = stones[0];
		x = stones[1];
		//比较x和y
		stones[0] = stones[0] - stones[1];
		stones[1] = 0;
		/*if (x==y)
		{
			stones[0] = stones[0] - stones[1];
			stones[1] = 0;
			//stones.erase(stones.begin(),stones.begin()+1);
		}
		else
		{
			stones[0] = stones[0] - stones[1];
			stones[1] = 0;
			//stones.erase(stones.begin() + 1);
		}*/
	}

	return stones[0];
	
}
