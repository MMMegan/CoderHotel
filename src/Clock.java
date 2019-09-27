public abstract class Clock{
    protected  int UTC_OFFSET;
    protected int localTime =0;

    public Clock(int utcOffset){
        UTC_OFFSET = utcOffset;
    }

    public abstract void setLocalTime(int localTime);

    public String getTime(){
        return String.valueOf(this.localTime);
    }

    public void setLocalTimeFromUtcZeroTime(int utcZeroTime) {
        this.localTime=Clock.makeHourWithinTo23(utcZeroTime+this.UTC_OFFSET);
    }

    private static int makeHourWithinTo23(int hour) {
        return (hour+24)%24;
    }
}