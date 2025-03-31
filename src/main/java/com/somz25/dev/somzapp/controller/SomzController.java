package com.somz25.dev.somzapp.controller;

import com.somz25.dev.somzapp.Entity.Orders;
import com.somz25.dev.somzapp.Entity.Payment;
import com.somz25.dev.somzapp.Entity.Product;
import com.somz25.dev.somzapp.Entity.Dashboard;

import com.somz25.dev.somzapp.service.SomzService;
import com.somz25.dev.somzapp.repository.OrderRepository;
import com.somz25.dev.somzapp.repository.PaymentRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//

@Slf4j
@RestController()
@RequestMapping("/api/v1")
public class SomzController {

    @Autowired
    SomzService somzService;

    @Autowired
     OrderRepository orderRepository; // Inject OrderRepository

    @Autowired
     PaymentRepository paymentRepository; // Inject PaymentRepository

    @GetMapping("/product")
    List<Product> getProduct() {
        log.debug("SOMAZ: Reading product");
        return somzService.getProduct();
    }


    @PostMapping("/product")
    Product dbsaveProduct(@RequestBody Product prod) {

        return somzService.dbSaveProduct(prod);
    }

    // ----------------------- Dashboard Endpoints -----------------------


    @GetMapping("/dashboard")
    List<Dashboard> getAllDashboards() {
        return somzService.getAllDashboards();
    }


    @PostMapping("/dashboard")
    Dashboard createDashboard(@RequestBody Dashboard dashboard)
    {
        return somzService.saveDashboard(dashboard);
    }

    // PUT - Update Dashboard
    @PutMapping("/dashboard/{id}")
    public Dashboard updateDashboard(@PathVariable Long id, @RequestBody Dashboard newDashboardData) {
        return somzService.updateDashboard(id, newDashboardData);
    }

    // DELETE - Remove Dashboard by ID
    @DeleteMapping("/pashboard/{id}")
    public String deleteDashboard(@PathVariable Long id) {
        somzService.deleteDashboard(id);
        return "Dashboard entry with ID " + id + " has been deleted";
    }
// Payment Endpoints
    @GetMapping("/payment")
    List<Payment> getPayment() {
        log.debug("SOMAZ: Reading payment");
        return somzService.getPayment();
    }


    @PostMapping("/payment")
    Payment createPayment(@RequestBody Payment payment)
    {
        return somzService.dbSavePayment(payment);
    }

// Order Endpoints
    @GetMapping("/orders")
    List<Orders> getOrder() {

        return somzService.getOrder();
    }


    @PostMapping("/orders")
    Orders createOrder(@RequestBody Orders orders)
    {
        return somzService.dbSaveOrder(orders);
    }

    //@PostMapping("/create")
  //  public ResponseEntity<String> createOrderWithPayment(@RequestBody OrderPaymentDTO request) {
    //    Orders order = request.getOrder();
       // Payment payment = request.getPayment();
//
        // Save order
    //    Orders savedOrder = somzService.save(order);

        // Set orderId in payment and save payment
   //     payment.setOrderid(savedOrder.getId().longValue());
       // paymentRepository.save(payment);

       // return ResponseEntity.ok("Order and payment created successfully!");
   // }

}


