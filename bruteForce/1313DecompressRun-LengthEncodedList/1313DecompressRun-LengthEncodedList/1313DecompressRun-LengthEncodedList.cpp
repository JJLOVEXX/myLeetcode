#include<iostream>
#include<vector>
using namespace std;

vector<int> decompressRLElist(vector<int>&);

int main() {
	vector<int> nums = { 1,2,3,4 };
	vector<int>result=decompressRLElist(nums);
	for(auto &number:result)
	{
		cout << number << " ";
	}
	system("pause");
}
vector<int> decompressRLElist(vector<int>& nums) {
	vector<int>temp;
	for (int i = 0;i<nums.size(); i++) {
		if (i%2==0)//The repeat times per bit
		{
			for (int j = nums[i];j>0; j--)//Repeat the bit
			{
				temp.push_back(nums[i + 1]);//Combine the vectors
			}
		}
	}
	return temp;
}