package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@Entity // Key 값이 반드시 필요함
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
