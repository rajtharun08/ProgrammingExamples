    int majorityElement(vector<int>& nums) 
    {
        int maxcount=0;
        int maxelement=0;
        unordered_map<int,int> count;
        for(int i:nums)
        {
            count[i]++;
        }
        for (auto &j:count)
        {
            if(maxcount<j.second)
            {
                maxcount=j.second;
                maxelement=j.first;
            }
        }
        return maxelement;
    }