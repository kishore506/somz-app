package com.somz25.dev.somzapp.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Payment {
    @Id
    Integer id;

    Integer amount;
    String posid;

    @OneToOne
    @JoinColumn(name = "orderid", referencedColumnName = "id")
    @JsonBackReference
    Orders orders;
    //ZLong orderid;

    // Getters and Setters

    // public Long getOrderid() {
     //   return orderId;
    //}

   // public void setOrderid(Long orderId) {  // Fix: Add this setter method
     //   this.orderId = orderId;
   // }
}






