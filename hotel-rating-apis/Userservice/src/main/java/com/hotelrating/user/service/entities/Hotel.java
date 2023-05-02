package com.hotelrating.user.service.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    private  String id;
    private  String name;
    private  String location;
    private  String about;
}