package project.Eyes_On_You.domain.entity;

import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String phoneNum;
    @Column
    private String wardName;

    @Builder
    public User(Long id, String name, String phoneNum, String wardName) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.wardName=wardName;
    }
}
