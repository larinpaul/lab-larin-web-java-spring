package com.example.larinwebjavaspring.data;

@Entity
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationId;

    @NotBlank(message = "Number is mandatory")
    private String number;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "vehicleId")
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    private VehicleOwner owner;

    // standard constructors / setters / getters / toString



}
