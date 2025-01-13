public class RearWheel extends DriveTrains{
    RearWheel(){
        drive  = "Rear Wheel";
    }
    @Override
    void getDrive(String d) {
        drive = d;
    }
}
