package com.somz25.dev.somzapp.service;

import com.somz25.dev.somzapp.Entity.Orders;
import com.somz25.dev.somzapp.Entity.Product;
import com.somz25.dev.somzapp.Entity.Dashboard;
import com.somz25.dev.somzapp.Entity.Payment;
import com.somz25.dev.somzapp.repository.OrderRepository;
import com.somz25.dev.somzapp.repository.PaymentRepository;
import com.somz25.dev.somzapp.repository.SomzRepository;
import com.somz25.dev.somzapp.repository.DashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SomzService implements ISomzService {

    @Autowired
    SomzRepository somzRepository ;

    @Override
    public List<Product> getProduct() {
        List<Product> dbProds = (List<Product>) somzRepository.findAll();
        // process items in the list received freom DB
        return dbProds;
    }

    public Product dbSaveProduct(Product inProd ) {
        Product aprd = somzRepository.save( inProd );
        return aprd;
    }

    @Autowired
    DashRepository DashRepository;


    public List<Dashboard> getAllDashboards() {
        List<Dashboard> dashboards = (List<Dashboard>) DashRepository.findAll();
        // Process data if needed
        return dashboards;
    }


    public Dashboard saveDashboard(Dashboard dashboard) {

        return DashRepository.save(dashboard);
    }

    // UPDATE (PUT)
    public Dashboard updateDashboard(Long id, Dashboard newDashboardData) {
        return DashRepository.findById(id).map(dashboard -> {
            dashboard.setAmount(newDashboardData.getAmount());
            dashboard.setOrders(newDashboardData.getOrders());
            dashboard.setStax(newDashboardData.getStax());
            return DashRepository.save(dashboard);
        }).orElseThrow(() -> new RuntimeException("Dashboard not found"));
    }

    // DELETE
    public void deleteDashboard(Long id) {
        if (!DashRepository.existsById(id)) {
            throw new RuntimeException("Dashboard not found");
        }
        DashRepository.deleteById(id);
    }



    @Autowired
    PaymentRepository paymentRepository;



    public List<Payment> getPayment() {
        List<Payment> payments = (List<Payment>) paymentRepository.findAll();
        return payments;
    }

    public Payment dbSavePayment(Payment payment ) {

        return paymentRepository.save(payment);
    }

    @Autowired
    OrderRepository orderRepository;


    public List<Orders> getOrder() {
        List<Orders> Orders = (List<com.somz25.dev.somzapp.Entity.Orders>) orderRepository.findAll();
        return Orders;
    }

    public Orders dbSaveOrder(Orders orders) {

        return orderRepository.save(orders);
    }

    //public void saveOrderWithPayment(Orders order, Payment payment) {
    //    order.setPayment(payment);
     //   payment.setOrders(order);
      //  OrderRepository.save(order);
   // }

   // public Payment save(Payment payment) {
      //  return PaymentRepository.save(payment);
   // }
}
