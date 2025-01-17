package kz.aptekaplus.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name="products")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name="label_id", nullable=false)
    private Label label;


    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "id_registration_number")
    private String idRegistrationNumber;


    @Column(name = "international_name")
    private String internationalName;


    @Column(name = "country_producer")
    private String countryProducer;


    @Column(name = "expiration_date")
    private Double expirationDate;

    @Column(name = "dosage_form")
    private String dosageForm;


    @Column(name = "structure")
    private String structure;

    @Column(name = "price")
    private Double price;


    @ManyToMany(mappedBy = "basket")
    private List<User> busket;
}
