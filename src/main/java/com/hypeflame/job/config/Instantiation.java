package com.hypeflame.job.config;

import com.hypeflame.job.entities.*;
import com.hypeflame.job.enums.OrderStatus;
import com.hypeflame.job.repositories.CategoryRepository;
import com.hypeflame.job.repositories.OrderRepository;
import com.hypeflame.job.repositories.ProductRepository;
import com.hypeflame.job.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {


     /*   User u1 = new User(null, "Andre Santiago", "alfsantiago96@gmail.com", "997250298", "1234567");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "88888888", "*******");

        Order o1 = new Order(null, new Date(), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, new Date(), OrderStatus.PAID, u2);
        Order o3 = new Order(null, new Date(), OrderStatus.PAID, u1);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

        Payment pay1 = new Payment(null, new Date(), o1);
        o1.setPayment(pay1);

        orderRepository.save(o1);

*/
       /* Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        //categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
        //productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);
        //productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));*/



    }
}
