package com.example.projectdb.Model.dao;

import org.springframework.data.repository.ListCrudRepository;
import com.example.projectdb.Model.WebOrder;

public interface WebOrderDAO extends ListCrudRepository<WebOrder,Long>{
}
