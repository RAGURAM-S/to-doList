package org.nahuelrodriguez.entities;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;
import java.util.Objects;

@Table("to_do_items")
public class TodoItem {
    @PrimaryKey
    @Column
    private Long id;

    @Column
    private String description;

    @Column
    private String status;

    @Column
    private Instant createdDatetime;

    public TodoItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Instant createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return Objects.equals(id, todoItem.id) &&
                Objects.equals(description, todoItem.description) &&
                Objects.equals(status, todoItem.status) &&
                Objects.equals(createdDatetime, todoItem.createdDatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, status, createdDatetime);
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", createdDatetime=" + createdDatetime +
                '}';
    }
}
