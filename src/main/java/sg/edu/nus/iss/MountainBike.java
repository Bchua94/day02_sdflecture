package sg.edu.nus.iss;

public class MountainBike {
    
    public int seatHeight;

    

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int setHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        //return "MountainBike [seatHeight=" + seatHeight + "]";
        return super.toString() + "\nSeat Height=" + seatHeight;
    }


}
