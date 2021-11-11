import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Modifier {

    public static double GetHoursRemoveFixedTask(Day day, FixedTask task){
        int NumberOfBlocks = task.durationToInt();
        double taskStartTime = ConvertTimeToDouble.ConvertDateTimeDouble(task.getStartDateTime());
        int i = 0;
        double overLap = 0;
        while (i < NumberOfBlocks) {
            double time = taskStartTime + i;
            if (!day.getTodaySchedule().get(time).equals("")){
                overLap ++;
            }
            i ++;}
        return overLap/2.0;

    }

    public static LinkedHashMap<Day, Double> GetHoursRemoveNonFixedTask(Week week, NonFixedTask task){
        LinkedHashMap<Day, Double> MapDayTimeRemove = new LinkedHashMap<>();
        for(Day day: week.getDays()) {
            List<Double> time = new ArrayList<>();
            for (double key : day.getTodaySchedule().keySet())
            {
            String value = day.getTodaySchedule().get(key);
            if (value.equals("")){time.add(key);}
            }
            double freeDuration = 0.0;
            double maxFreeDuration = 0.0;
            for (int i = 0; i < time.size(); i++) {
                if((time.get(i + 1) - time.get(i)) == 0.5)
                {
                    freeDuration += 0.5;
                    if (freeDuration >= maxFreeDuration)
                    {
                        maxFreeDuration = freeDuration;
                    }
                }
                else{freeDuration = 0.0;}
            }
            double taskDuration = ConvertTimeToDouble.ConvertLocalTimeDouble(task.getDuration());
            double difference = taskDuration - maxFreeDuration;
            MapDayTimeRemove.put(day, difference);
        }
        return MapDayTimeRemove;
    }

    //public static double GetHoursRemoveProject(Week week, double TotalHours){

}