package oop.clock;

public class Clock {
    private int hours, minutes, seconds;

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int h, int m, int s) {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    public Clock(int midnight_seconds) {
        setClock(midnight_seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setClock(int midnight_seconds) {
        this.hours = midnight_seconds / 3600;
        this.minutes = (midnight_seconds - this.hours * 3600) / 60;
        this.seconds = (midnight_seconds - this.hours * 3600 - this.minutes * 60);
    }


    public void tick() {
        this.seconds++;

        if (this.seconds == 60) {
            this.seconds = 0;
            this.minutes++;

            if (this.minutes == 60) {
                this.minutes = 0;
                this.hours++;

                if (this.hours == 24) {
                    this.hours = 0;
                }
            }
        }
    }

    public void tickDown() {
        this.seconds--;

        if (this.seconds == -1) {
            this.seconds = 59;
            this.minutes--;

            if (this.minutes == -1) {
                this.minutes = 59;
                this.hours--;

                if (this.hours == -1) {
                    this.hours = 23;
                }
            }
        }
    }

    public void addClock(Clock clock) {
        this.seconds += clock.getSeconds();
        this.minutes += clock.getMinutes();
        this.hours += clock.getHours();

        if (this.seconds >= 60) {
            this.minutes++;
            this.seconds -= 60;
        }

        if (this.minutes >= 60) {
            this.hours++;
            this.minutes -= 60;
        }

        if (this.hours >= 24) {
            this.hours -= 24;
        }
    }

    @Override
    public String toString() {
        return "Clock{"
                + String.format("%02d", hours) + ":"
                + String.format("%02d", minutes) + ":"
                + String.format("%02d", seconds) +"}";
    }
}
