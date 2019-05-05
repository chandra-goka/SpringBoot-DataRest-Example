package com.onlinetutorialspoint.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String category;
}
