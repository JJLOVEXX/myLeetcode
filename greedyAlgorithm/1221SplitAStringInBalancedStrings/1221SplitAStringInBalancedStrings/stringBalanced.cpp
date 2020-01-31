#include<iostream>
#include<string>
using namespace std;

int balancedStringSplit(string);
int main() {
	string s = "RLLLLRRRLR";
	cout << balancedStringSplit(s);
	system("pause");
}

int balancedStringSplit(string s) {
	int a = 0;//Record the string to judge whether encountering balanced string
	int count = 0;
	for (int i = 0; i < s.size(); i++)
	{
		if (s[i]=='R')
		{
			a++;
		}
		else
		{
			a--;
		}
		if (a==0)
		{
			count++;
		}
	}
	return count;
}