// Last updated: 3/14/2026, 11:50:16 AM
class ParkingSystem {
    private static int big;
    private static int small;
    private static int medium;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 3){
            if(small <= 0){
                return false;
            }
            else{
                small -= 1;
                return true;
            }
        }
        else if(carType == 2){
            if(medium <= 0){
                return false;
            }
            else{
                medium -= 1;
                return true;
            }
        }
        else if(carType == 1){
            if(big <= 0){
                return false;
            }
            else{
                big -= 1;
                return true;
            }
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */