/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webcomponent.rentacar.repository;

import org.springframework.data.repository.CrudRepository;
import com.webcomponent.rentacar.model.CombustibleModel;

/**
 *
 * @author 19947450-2
 */
public interface CombustibleRepository extends CrudRepository<CombustibleModel, Integer> {
    
}
