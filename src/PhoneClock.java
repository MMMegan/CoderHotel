public class PhoneClock extends Clock{
    public UtcTime utcTime;
    public PhoneClock(int utcOffset){
        super(utcOffset);
    }

    @Override
    public void setLocalTime(int localTime){
        super.localTime=localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }

    public void setUtcTime(UtcTime utcTime){
        this.utcTime = utcTime;
    }
}
