// Last updated: 3/14/2026, 11:50:25 AM
class TimeMap {
    HashMap<String, TreeMap<Integer , String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer , String> tree = new TreeMap<>();
        if(map.containsKey(key)){
            map.get(key).put(timestamp , value);
        }
        else{
            tree.put(timestamp , value);
            map.put(key , tree);
        }
    }

    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            Integer a = map.get(key).floorKey(timestamp);
            if( a == null){
                return "";
            }
            else{
                return map.get(key).get(a);
            }
        }
        else{
            return "";
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */