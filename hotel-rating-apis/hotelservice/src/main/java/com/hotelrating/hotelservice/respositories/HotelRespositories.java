package com.hotelrating.hotelservice.respositories;

import com.hotelrating.hotelservice.entites.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRespositories extends JpaRepository<Hotel, String> {
}
