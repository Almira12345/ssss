package com.narxoz.kz.ssss.repository;
import com.narxoz.kz.ssss.model.Main;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MainRepository extends JpaRepository<Main, Long> {
}