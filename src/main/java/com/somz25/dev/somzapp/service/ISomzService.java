package com.somz25.dev.somzapp.service;

import com.somz25.dev.somzapp.Entity.Product;
import java.util.List;

public interface ISomzService {

    List<Product> getProduct() ;

    Product dbSaveProduct( Product product );
}
