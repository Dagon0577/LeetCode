/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/


class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int i;
        for(i=0;i<employees.size();i++){
            if(employees.get(i).id==id){
                break;
            }
        }
        int sum=employees.get(i).importance;
        for(int j=0;j<employees.get(i).subordinates.size();j++){
                sum+=getImportance(employees,employees.get(i).subordinates.get(j));
        }
        return sum;
    }
}

/*hashmap*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> map = new HashMap<>();
        int value = 0;
        for(Employee employee:employees)
        {
            map.put(employee.id,employee);
        }
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(map.get(id));
        while(!queue.isEmpty())/*类似leetcode 637*/
        {
            Employee employee = queue.poll();
            value+=employee.importance;
            for( int subordinate:employee.subordinates)
            {queue.offer(map.get(subordinate));}
        }
        return value;
    }
}

