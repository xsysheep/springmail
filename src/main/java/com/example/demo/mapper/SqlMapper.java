package com.example.demo.mapper;

import com.example.demo.bean.Test;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlMapper {

    Test find();

}

