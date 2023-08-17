import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();

        final int[] counter = {10};

        TimerTask task= new TimerTask() {
            @Override
            public void run() {
                if (counter[0] >0){
                    System.out.println(counter[0] +"seconds");
                    counter[0]--;
                }
                else {
                    System.out.println("Happy new year");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2024);
        date.set(Calendar.MONTH,Calendar.JANUARY);
        date.set(Calendar.DAY_OF_MONTH,1);
        date.set(Calendar.HOUR_OF_DAY,0);
        date.set(Calendar.MINUTE,0);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);

        //timer.schedule(task,date.getTime());

        timer.scheduleAtFixedRate(task,0,1000);
    }


}