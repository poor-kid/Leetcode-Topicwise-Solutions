/*
// Definition for Employee.
class Employee {
public:
    int id;
    int importance;
    vector<int> subordinates;
};
*/

class Solution {
public:
    int getImportance(vector<Employee*> employees, int id) {
        
        int len = employees.size();
        if(len == 0)
            return 0;
        int val = 0;
        queue<int> q;
        for(auto employee : employees)
        {
            if(employee->id == id)
            {
                val += employee->importance;
                for(auto subordinate : employee->subordinates)
                   if(subordinate)
                        q.push(subordinate);
            }
            
        }
        
        while(!q.empty())
        {
             for(auto employee : employees)
            {
                int id = q.front();
                if(employee->id == id)
                {
                    q.pop();
                    val += employee->importance;
                    for(auto subordinate : employee->subordinates)
                        if(subordinate)
                            q.push(subordinate);
                }

            }
        }
        return val;
        
    }
};