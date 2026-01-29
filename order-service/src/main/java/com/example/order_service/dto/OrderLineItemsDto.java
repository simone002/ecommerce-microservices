package com.example.order_service.dto; // Controlla se è order_service o orderservice

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
  private Long id;
  private String skuCode; // Il codice del prodotto (es. "iphone_15")
  private BigDecimal price;
  private Integer quantity;
}
