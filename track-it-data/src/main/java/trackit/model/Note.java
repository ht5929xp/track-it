package trackit.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Note extends BaseEntity {
    private Category org;
    private Group group;
    private User createdBy;
    private String note;
    private LocalDateTime added;

    public boolean isOnDate(LocalDate date) {
        boolean result = false;

        if (this.added != null && date != null) {
            LocalDate addedDate = added.toLocalDate();
            return addedDate.equals(date);
        }

        return false;
    }

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

    public Category getOrg() {
        return org;
    }

    public void setOrg(Category org) {
        this.org = org;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
