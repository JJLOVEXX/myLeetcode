#include<iostream>
#include<string>
#include<vector>

using namespace std;

int minDeletionSize(vector<string>&);

int main() {
	vector<string> a = { "cba", "daf", "ghi" };
	cout<<minDeletionSize(a);
	system("pause");
}

int minDeletionSize(vector<string>& A) {
	int res = 0;
	for (int j = 0; j < A[0].size(); j++)//column
	{
		for (int i = 0; i < A.size()-1; i++)//row
		{
			if (A[i][j] > A[i + 1][j]) {
				res++;
				break;
			}
		}
	}
	return res;
}