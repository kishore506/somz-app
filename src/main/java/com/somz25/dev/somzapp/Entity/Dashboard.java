package com.somz25.dev.somzapp.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Dashboard {


    @Id

    Integer id ;

   Integer orders ;
     Double amount ;
     double discount ;
     double stax;

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
    this.id = id;
}

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

public Double getAmount() {
    return amount;
}

public void setAmount(Double amount) {
    this.amount = amount;
}


public Double getStax() {
    return stax;
}

public void setStax(Double stax) {
    this.stax = stax;
}
}