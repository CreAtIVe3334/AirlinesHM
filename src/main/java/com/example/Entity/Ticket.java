package com.example.Entity;

import com.example.Enums.State;
import com.example.Enums.Status;
import com.example.Enums.TicketType;
import lombok.*;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    Flight flight_id;
    @OneToOne
    Passenger passenger_id;
    Status status;
    State state;
    TicketType ticketType;
    @Embedded
    Details details;
}
