package org.example.entities;

public abstract class LongIdEntity {//Open Closed
    private Long id;

    public LongIdEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
