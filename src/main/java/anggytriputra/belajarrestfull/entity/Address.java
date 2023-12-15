package anggytriputra.belajarrestfull.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")

public class Address {

    @Id
    private String id;

    private String street;

    private String city;

    private String province;

    @Column(name = "postal_code")
    private String postal_code;

    @ManyToOne
    @JoinColumn(name = "contact_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "contact")
    private List<Address> addresses;


}
