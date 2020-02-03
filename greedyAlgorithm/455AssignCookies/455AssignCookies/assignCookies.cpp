#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int findContentChildren(vector<int>&, vector<int>&);

int main() {
	vector<int>g = { 1,2,3 }; vector<int>s = { 3 };
	cout << findContentChildren(g, s);
	system("pause");
}

int findContentChildren(vector<int>& g, vector<int>& s)
{
	int count = 0;
	sort(g.begin(), g.end());
	sort(s.begin(), s.end());
	for (int i = 0; i < g.size(); i++)
	{
		for (int j = 0; j < s.size(); j++)
		{
			if (s[j]>=g[i])
			{
				count++;
				s.erase(s.begin()+j);
				break;
			}
		}
	}
	return count;
}
