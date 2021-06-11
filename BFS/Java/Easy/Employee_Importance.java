/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
        int len = employees.size();
        Map<Integer,Employee> map = new HashMap<>();
        for(Employee e: employees)
            map.put(e.id,e);
        
        int totalImp =0;
        Queue<Employee> queue = new LinkedList<Employee>();
        queue.offer(map.get(id));
        while(!queue.isEmpty())
        {
            int size = queue.size();
            Employee currNode = queue.poll();
            totalImp += currNode.importance;
            for(int i : currNode.subordinates)
            {
                queue.add(map.get(i));   
            }
        }
        return totalImp;
        
    }
}