package com.somz25.dev.somzapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Product {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id ;

    Integer modelid ;
    Double price ;
    Integer stock ;

}
