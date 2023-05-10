package com.martins.ecommerce.model.data;

import com.martins.ecommerce.model.utils.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Document
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private String id;
    private String username;
    private LocalTime ordered;
    private LocalDate shipped;
    private OrderStatus status;
    private Address shippingAddress;
    private BigDecimal total;
}
