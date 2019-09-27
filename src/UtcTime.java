public class UtcTime extends TimeSubject {
    public int utcZeroTime;

    public int getUtcZeroTime() {
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
        notifyAllClocks();
    }

    @Override
    public void notifyAllClocks(){
        for (Clock clock : super.clocks.values()){
            clock.setLocalTimeFromUtcZeroTime(this.utcZeroTime);
        }
    }

    public void printTimeOfAllClocks(){
        for (String clockName : super.clocks.keySet()){
            System.out.println(clockName+":"+super.clocks.get(clockName).getTime());
        }
    }
}
