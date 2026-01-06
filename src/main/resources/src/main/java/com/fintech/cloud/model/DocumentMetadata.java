package com.fintech.cloud.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "document_metadata")
@Data @NoArgsConstructor @AllArgsConstructor
public class DocumentMetadata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String s3Url;
    private Long fileSize;
    private LocalDateTime uploadedAt;
}
