#include<iostream>
#include<vector>
using namespace std;

int game(vector<int>&, vector<int>&);
int main() {
	vector<int> guess{ 1,2,3 };
	vector<int> answer{ 1,2,3 };
	cout<<game(guess, answer);
	system("pause");
}
int game(vector<int>& guess, vector<int>& answer) {
	int count = 0;
	for (int i = 0; i < 3; i++)
	{
		if (guess[i]==answer[i])
		{
			count++;
		}
	}
	return count;
}