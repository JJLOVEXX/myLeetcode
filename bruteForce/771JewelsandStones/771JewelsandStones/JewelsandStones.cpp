#include<iostream>
#include<string>
using namespace std;

int numJewelsInStones(string,string);
int main() {
	string j = "z";
	string s = "ZZ";
	cout<<numJewelsInStones(j, s);
	system("pause");
}

int numJewelsInStones(string J, string S) {
	int count = 0;
	for (int i = 0; i < J.size(); i++)
	{
		for (int k = 0; k < S.size(); k++)
		{
			if (S[k]==J[i])
			{
				count++;
			}
		}
	}
	return count;
}