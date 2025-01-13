public class AllWheel extends DriveTrains{

    AllWheel(){
        drive = "All Wheel";
    }
    @Override
    void getDrive(String d) {
        drive = d;
    }
}
