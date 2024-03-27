package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
    private final String username;
    private final Date moment;

    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public Date getMoment() {
        return moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry logEntry)) return false;
        return Objects.equals(getUsername(), logEntry.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }
}
