// Last updated: 3/14/2026, 11:51:20 AM
class Solution {
    public int romanToInt(String s) {
           HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i= 0 ; i< s.length(); i++){
            list.add(map.get(String.valueOf(s.charAt(i))));
        }

        for(int i = 0 ; i< list.size(); i++){

            System.out.println("i"+i);

            System.out.println("Count"+count);

            if(i == list.size()-1){

                System.out.println("CountIf"+count);

                count+=list.get(i);

                break;

            }
            else{
                if(list.get(i) >= list.get(i+1)){
                    System.out.println("Elseif");
                    count = count + list.get(i);
                    System.out.println(list.get(i));

                    System.out.println("Count"+count);
                }
                else{
                    System.out.println("Elseif");

                    count+= (list.get(i+1) - list.get(i));
                    i++;


                    System.out.println("Count"+count);
                }
            }
        }

        return count;
    }
}