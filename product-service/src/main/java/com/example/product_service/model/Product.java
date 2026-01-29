package com.example.product_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity                     // Dice a Spring: "Questa classe diventerà una tabella nel DB"
@Table(name = "t_products") // Specifica il nome della tabella
@Data                       // Lombok: crea in automatico Getter, Setter, toString...
@Builder                    // Lombok: ci aiuta a creare oggetti in modo pulito
@AllArgsConstructor         // Lombok: costruttore con tutti i campi
@NoArgsConstructor          // Lombok: costruttore vuoto (obbligatorio per JPA)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // L'ID si autoincrementa (1, 2, 3...)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price; // Per i soldi si usa sempre BigDecimal, mai Double!
}