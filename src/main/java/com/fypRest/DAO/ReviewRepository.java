package com.fypRest.DAO;

import com.fypRest.enitity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer>
{
}
