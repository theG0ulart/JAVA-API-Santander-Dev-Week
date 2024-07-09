package edu.wearedev.SimpleBank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "tab_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(nullable = false)
    private String accountAgency;

    @Column(scale = 2, precision = 13)
    private BigDecimal accountBalance;

    @Column(scale = 2, precision = 13)
    private BigDecimal accountLimit;

}
