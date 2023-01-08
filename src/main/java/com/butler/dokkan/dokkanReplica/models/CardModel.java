package com.butler.dokkan.dokkanReplica.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CardModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long attack;
    private Long defense;
    private Long hp;
    private String type;

    // Eventually incorporate passive skills, would need to be an Object defined in other class
}
