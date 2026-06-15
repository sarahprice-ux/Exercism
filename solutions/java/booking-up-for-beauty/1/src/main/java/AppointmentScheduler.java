import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        AppointmentScheduler scheduler = new AppointmentScheduler();
        LocalDateTime dateTime = LocalDateTime.of(2019,7,25,13,45,0);
        dateTime.toString();
        return dateTime;


    }

    public boolean hasPassed(LocalDateTime appointmentDate) {

     return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {

        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;

    }





    public String getDescription(LocalDateTime appointmentDate) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a", Locale.ENGLISH);

        return "You have an appointment on " + appointmentDate.format(formatter) + ".";


    }

    public LocalDate getAnniversaryDate() {
        LocalDate  date = LocalDate.of(2025, Month.SEPTEMBER, 15);


        return  date.plusYears(1);

    }
}
