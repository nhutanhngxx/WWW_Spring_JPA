package com.example.models;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
public class Account {
    @Id @Column(name = "accountId") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String owerName;
    private double balance;
}
