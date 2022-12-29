package trackit.models;

import java.time.LocalDateTime;

public class Note {
    private Organization org;//test
    private User createdBy;
    private String note;
    private LocalDateTime added;

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getAdded() {
        return added;
    }

    public void setAdded(LocalDateTime added) {
        this.added = added;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }
}
