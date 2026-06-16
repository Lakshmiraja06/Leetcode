class RideSharingSystem {
    Queue<Integer> rider;
    Queue<Integer> driver;
    Set<Integer> cancel;
    public RideSharingSystem() {
        rider = new LinkedList<>();
        driver = new LinkedList<>();
        cancel = new HashSet<>();
    }
    
    public void addRider(int riderId) {
        rider.offer(riderId);
        cancel.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.offer(driverId);
    }
    
    public int[] matchDriverWithRider() {
        while(!rider.isEmpty() && !cancel.contains(rider.peek())){
            rider.poll();
        }
        int[] result = new int[2];
        if(rider.isEmpty() || driver.isEmpty()) return new int[]{-1,-1};
        else{
            result[0]=driver.poll();
            result[1]=rider.poll();
            return result;
        }
    }
    
    public void cancelRider(int riderId) {
        cancel.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */