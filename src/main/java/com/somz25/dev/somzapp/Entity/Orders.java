package com.somz25.dev.somzapp.Entity;
import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "orders")

public class Orders {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Getters and Setters
    @Id
    Integer id;

    @Temporal(TemporalType.DATE)
     Date orderdate;

    String orderby;
    Long modelid;
  String descrn;

    @Column(precision = 10, scale = 2)
     BigDecimal price;

     Integer quantity;

    @Column(precision = 10, scale = 2)
     BigDecimal amount;

    @Column(precision = 10, scale = 2)
     BigDecimal discount;


    @Column(precision = 10, scale = 2)
     BigDecimal salestax;

    @OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
    @JsonManagedReference
   Payment Payment;
}

