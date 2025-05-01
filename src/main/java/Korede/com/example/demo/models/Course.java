package Korede.com.example.demo.models;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    public Course (){}

    public Course (Long id, String name){}
}
