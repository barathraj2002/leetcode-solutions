// Last updated: 3/14/2026, 11:50:29 AM
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            list.add(new int[]{position[i], speed[i]});
        }

        Collections.sort(list, (a,b)-> b[0] - a[0]);

        Stack<Double> tracking = new Stack<>();
        int fleetCount = 0;
        double top = 0.0;
        for (int i = 0; i < list.size(); i++) {
            double time = (target - list.get(i)[0]) ;
            time = time / list.get(i)[1];

            if(tracking.isEmpty()){
                tracking.push(time);
                top = time;
            }
            else {
                if(!tracking.isEmpty() && top >= time){
                    tracking.push(time);
                }
                else if (!tracking.isEmpty() && top < time){
                    tracking.clear();
                    fleetCount++;
                    tracking.push(time);
                    top = time;
                }
            }
        }
        if(!tracking.isEmpty()){
            fleetCount++;
        }

        return  fleetCount;
    }
}