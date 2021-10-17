import java.time.LocalDateTime;
import java.time.LocalTime;


public class Converter {

    public double ConvertDateTimeDouble (LocalDateTime localTime){
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        double minuteDouble = ((double)minute/60);
        return (double)hour + minuteDouble;}

    public double ConvertLocalTimeDouble (LocalTime localTime){
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        double minuteDouble = ((double)minute/60);
        return (double)hour + minuteDouble;}


    public LocalTime ConvertDoubleToLocalTime (Double time){
        int hour = (int)Math.floor(time);
        int minute = (int)((time - hour)*60);
        return LocalTime.of(hour, minute);
    }

}
