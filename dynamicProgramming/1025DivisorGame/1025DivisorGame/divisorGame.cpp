#include<iostream>


using namespace std;

bool divisorGame(int);

int main() {
	int n = 10;
	cout << divisorGame(n);
	system("pause");
}

bool divisorGame(int N)
{
	if (N%2==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
