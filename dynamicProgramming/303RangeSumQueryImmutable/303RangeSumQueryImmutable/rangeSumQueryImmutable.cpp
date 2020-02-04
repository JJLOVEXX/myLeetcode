#include<iostream>
#include<vector>

using namespace std;

class NumArray {
public:
	
	NumArray() {

	}
	NumArray(vector<int>& nums) {
		
	}
	int sumRange(int, int);
private:
	vector<int> nums;
};
int main() {
	vector<int> nums = { -2, 0, 3, -5, 2, -1 };
	NumArray(nums);
}

int NumArray::sumRange(int i, int j)
{
	int sum = 0;
	for (int k = i; k <= j; k++)
	{
		sum += nums[k];
	}
	return sum;
}
